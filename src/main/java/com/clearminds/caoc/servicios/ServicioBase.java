package com.clearminds.caoc.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.caoc.bdd.ConexionBDD;
import com.clearminds.caoc.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion;
	
	public void abrirConexion() throws BDDException{
		conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion(){
		if(conexion!=null){
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error al cerrar la conexion");
			}
			System.out.println("Conexion cerrada");
		}
		
	}
}
