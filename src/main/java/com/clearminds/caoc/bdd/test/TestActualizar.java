package com.clearminds.caoc.bdd.test;

import com.clearminds.caoc.dtos.Estudiante;
import com.clearminds.caoc.excepciones.BDDException;
import com.clearminds.caoc.servicios.ServicioEstudiante;

public class TestActualizar {
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("Carlos", "Obando",2,10));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
