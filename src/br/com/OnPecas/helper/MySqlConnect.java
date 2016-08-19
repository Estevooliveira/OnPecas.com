package br.com.OnPecas.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnect {

	public static Connection ConectarDb(){
		Connection conectar = null;
		//Class.forName(“com.mysql.jdbc.Driver”);
		//Connection conexão = DriverManager.getConnection(“jdbc:odbc:IJPlanetas");
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conectar = DriverManager
					.getConnection("jdbc:mysql://localhost/onpecas_testes", "root", "bcd127");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conectar;

	}
}
