package com.clearminds.caoc.servicios;

import com.clearminds.caoc.dtos.Estudiante;
import com.clearminds.caoc.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante.toString());
		cerrarConexion();

	}
}
