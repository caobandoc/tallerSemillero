package com.clearminds.caoc.bdd.test;

import com.clearminds.caoc.dtos.Estudiante;
import com.clearminds.caoc.excepciones.BDDException;
import com.clearminds.caoc.servicios.ServicioEstudiante;

public class TestServicio {
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(new Estudiante("Carlos", "Obando",21));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
