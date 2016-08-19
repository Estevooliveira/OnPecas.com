package br.com.OnPecas.controller;

import java.net.URL;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

import br.com.OnPecas.helper.MySqlConnect;
import br.com.OnPecas.model.Cargo;
import br.com.OnPecas.model.Funcionario;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

public class FuncionariosController implements Initializable{


	@FXML Button btnSalvar;
	@FXML TextField txtNome;
	@FXML ComboBox<Cargo> cboxCargo;
	@FXML DatePicker dataAdmissao;
	private Funcionario funcionario;
	@FXML ListView<Funcionario> listFuncionarios;
	@FXML Button btnDeletar;
	@FXML Button btnAtualizar;


	@FXML public void salvar() {
		funcionario= new Funcionario();
		funcionario.setDataAdmissao(Selecione());
		funcionario.setCargo(cboxCargo.getValue());
		funcionario.setNome(txtNome.getText());
		Funcionario.inserir(funcionario);
		System.out.println(funcionario);
		InserirNaLista();

	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cboxCargo.getItems().addAll(Cargo.selecionar());
		InserirNaLista();
	}



	@FXML public LocalDate Selecione() {
		LocalDate data;
		data=dataAdmissao.getValue();
		System.out.println(data);
		return data;


	}

	public void InserirNaLista(){
		listFuncionarios.getItems().clear();
		listFuncionarios.getItems().addAll(Funcionario.Lista());

	}

	@FXML public void Atualizar() {}



	@FXML public void Deletar() {}

}
