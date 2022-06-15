package br.com.rhz.sistemas.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    
    public static java.sql.Date ConvertDataFormParaBanco(java.util.Date data) {
	return new java.sql.Date(data.getTime());

    }

    public static String Format(Date data) {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	String dataString = sdf.format(data);

	return dataString;

    }
    
}
