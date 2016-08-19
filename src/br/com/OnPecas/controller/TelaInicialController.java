package br.com.OnPecas.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class TelaInicialController implements Initializable{


	@FXML Label txtNome;


		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			//pesquisa no banco
			txtNome.setText("BOM DIA");
		}

}
