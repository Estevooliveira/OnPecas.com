package br.com.OnPecas.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TodasTelas {


	//chama a tela principal
		public final void telaInicio(Stage segundaStege){
			Parent root = null;
			try {
				root = FXMLLoader.load(getClass().getResource("TelaInicial.fxml"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			segundaStege.setScene( new Scene(root));

			segundaStege.show();
		}

		// chama a tela de relatorios
			public final void telaRelatorios(Stage TerceiraStege){
				Parent root = null;
				try {
					root = FXMLLoader.load(getClass().getResource("Relatorios.fxml"));

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				TerceiraStege.setScene( new Scene(root));

				TerceiraStege.show();
			}

		// chama a tela de graficos
				public final void telaGraficos(Stage quartaStege){
					Parent root = null;
					try {
						root = FXMLLoader.load(getClass().getResource("Graficos.fxml"));

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					quartaStege.setScene( new Scene(root));

					quartaStege.show();
				}

		// chama a tela de Funcionarios
			public final void telaFuncionarios(Stage quintaStege){
				Parent root = null;
				try {
					root = FXMLLoader.load(getClass().getResource("Funcionarios.fxml"));

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				quintaStege.setScene( new Scene(root));

				quintaStege.show();
			}
}
