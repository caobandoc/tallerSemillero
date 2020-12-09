package com.clearminds.caoc.bdd;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.caoc.excepciones.BDDException;

public class ConexionBDD {
	/**
	 * Devuelve la propiedad a buscar
	 * 
	 * @param propiedad
	 *            nombre de la propiedad
	 * @return Devuelve un string, si no devuelve null
	 */
	public static String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
			return p.getProperty(propiedad);
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * Conexion a la base de datos
	 * 
	 * @return devuelve Connection
	 * @throws SQLException 
	 */
	public static Connection obtenerConexion() throws BDDException {
		String user = leerPropiedad("usuario");
		String pass = leerPropiedad("password");
		String conexionURL = leerPropiedad("urlConexion") + ";" + "user=" + user + ";" + "password=" + pass + ";"
				+ "loginTimeout=30;";
		try {
			return DriverManager.getConnection(conexionURL);
		} catch (SQLException e) {
			throw new BDDException("No se pudo conectar a la base de datos.");
		}
	}
}
