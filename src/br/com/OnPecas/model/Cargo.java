package br.com.OnPecas.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.OnPecas.helper.MySqlConnect;

/*import br.com.contatos.helper.MySqlConnect;
import br.com.contatos.model.Contato;
*/
public class Cargo {
	private int id;
	private String nome;
	private double salario;


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static List<Cargo> selecionar(){

		List<Cargo> lista = new ArrayList<Cargo>();

		Connection con = MySqlConnect.ConectarDb();
		String sql = "select * from TBL_cargo;";

		try {
			ResultSet rs = con.createStatement().executeQuery(sql);

			while(rs.next()){

				Cargo c = new Cargo();
				c.setId(rs.getInt("id_cargo"));//(rs.getString("id_cargo"));
				c.setNome(rs.getString("nome_cargo"));
				c.setSalario(rs.getDouble("salario"));



				lista.add(c);
			}

			con.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return lista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
