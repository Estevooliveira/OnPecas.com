package br.com.OnPecas.controller;

import br.com.OnPecas.view.Main;
import br.com.OnPecas.view.TodasTelas;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class MenuController {

	@FXML Hyperlink linkRelatorio;
	@FXML Hyperlink linkGrafico;
	@FXML Hyperlink linkFuncionarios;
	private TodasTelas telas;

	@FXML public void Graficos() {

		telas = new TodasTelas();
		Stage quartaStage= (Stage)linkRelatorio.getScene().getWindow();
		telas.telaGraficos(quartaStage);
	}

	@FXML public void relatorios() {
		telas = new TodasTelas();
		Stage terceiraStage= (Stage)linkRelatorio.getScene().getWindow();
		telas.telaRelatorios(terceiraStage);

	}

	@FXML public void Funcionarios() {

		telas = new TodasTelas();
		Stage quintaStage= (Stage)linkRelatorio.getScene().getWindow();
		telas.telaFuncionarios(quintaStage);
	}

}
