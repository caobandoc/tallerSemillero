package com.clearminds.caoc.excepciones;

import java.sql.SQLException;

public class BDDException extends SQLException {
	
	public BDDException(String mensaje) {
		super(mensaje);
	}
}
