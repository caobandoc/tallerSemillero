package com.clearminds.caoc.bdd.test;

import java.sql.Connection;

import com.clearminds.caoc.bdd.ConexionBDD;
import com.clearminds.caoc.excepciones.BDDException;

public class TestConexion {
	public static void main(String[] args) {
		try {
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion!=null){
				System.out.println("Conexion exitosa");
			}
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
