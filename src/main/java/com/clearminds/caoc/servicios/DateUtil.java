package com.clearminds.caoc.servicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String fechaActual(){
		Date fecha = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String texto = formateador.format(fecha);
		return texto;
	}
}
