package br.com.OnPecas.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import br.com.OnPecas.helper.Alerta;
import br.com.OnPecas.view.*;

public class LoginController {

	@FXML Button btnEntrar;
	@FXML TextField txtSenha;
	@FXML TextField txtUsuario;
	private TodasTelas tela1;
	private Alerta alerta;

	@FXML public void Entrar(){
		Stage segundaStage = (Stage)btnEntrar.getScene().getWindow();

		boolean verificado = Verificar(txtUsuario.getText(),txtSenha.getText());


		if(verificado == true){
				tela1 = new TodasTelas();
				tela1.telaInicio(segundaStage);
		}else{
			alerta.showError("Erro", "Usuário ou senha invalidos");
		}

	}
	private boolean Verificar(String usuario,String senha){
		//codigo de bando vai aqui
		if(usuario.equals("carlos") && senha.equals("123")){
			return true;
		}else{
			return false;
		}


	}

}
