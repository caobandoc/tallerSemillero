package com.clearminds.caoc.bdd;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad){
		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));
			return p.getProperty(propiedad);
		} catch (IOException e) {
			return null;
		}
		 
	}
}
