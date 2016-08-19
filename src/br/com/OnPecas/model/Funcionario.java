package br.com.OnPecas.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.OnPecas.helper.MySqlConnect;


public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private Cargo cargo;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome+"-"+dataAdmissao+"-"+cargo.getNome()+"-"+cargo.getSalario();
	}

	public static boolean inserir(Funcionario f){


		Connection con = MySqlConnect.ConectarDb();

		String sql ="insert into TBL_funcionario(nome_funcionario, dt_admissao, id_cargo) values( ?, ?, ?);";

		PreparedStatement parametros;

		try {
			parametros = con.prepareStatement(sql);
			parametros.setString(1,f.getNome());
			parametros.setString(2,f.getDataAdmissao().toString());
			parametros.setInt(3,f.getCargo().getId());

			parametros.executeUpdate();
			con.close();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//Alerta.showError("Erro", "Ocorreu um erro, tente novamente.");

			return false;


		}
	}
	public static List<Funcionario> Lista(){
		List<Funcionario> listaF = new ArrayList<Funcionario>();

		String sql = "select * from funcionario_cargo;";
		Connection con = MySqlConnect.ConectarDb();


		try {
			ResultSet rs = con.createStatement().executeQuery(sql);

			while(rs.next()){
				Cargo c = new Cargo();
				Funcionario f = new Funcionario();
				f.setNome(rs.getString("nome_funcionario"));//(rs.getString("id_cargo"));
			    LocalDate date = LocalDate.parse(rs.getString("dt_admissao"));
			    f.setDataAdmissao(date);
			    c.setNome(rs.getString("nome_cargo"));
			    c.setSalario(rs.getDouble("salario"));
				f.setCargo(c);

				System.out.println(f);

				listaF.add(f);
			}

			con.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return listaF;
	}
}



