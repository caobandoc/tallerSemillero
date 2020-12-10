package com.clearminds.caoc.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.caoc.bdd.ConexionBDD;
import com.clearminds.caoc.dtos.Estudiante;
import com.clearminds.caoc.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	/**
	 * Inserta a la base de datos un estudiante
	 * 
	 * @param estudiante
	 *            Recibe un estudiante
	 * @throws BDDException
	 *             Error al insertar estudiante
	 */
	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante.toString());
		Statement stmt = null;
		try {
			stmt = ConexionBDD.obtenerConexion().createStatement();

			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion) values('"
					+ estudiante.getNombre() + "','" + estudiante.getApellido() + "','" + estudiante.getEdad() + "','"
					+ DateUtil.fechaActual() + "')";

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Actualiznado estudiante: " + estudiante.toString());
		Statement stmt = null;
		try {
			stmt = ConexionBDD.obtenerConexion().createStatement();

			String sql = "update estudiantes set nombre='" + estudiante.getNombre() + "', apellido='"
					+ estudiante.getApellido() + "', edad='" + estudiante.getEdad() + "', fecha_modificacion='"
					+ DateUtil.fechaActual() + "' where id=" + estudiante.getId();

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}
}
