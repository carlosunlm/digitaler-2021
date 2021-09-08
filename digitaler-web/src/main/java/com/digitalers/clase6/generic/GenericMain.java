package com.digitalers.clase6.generic;

public class GenericMain {

	public static void main(String[] args) {
		
		ArticuloDao articuloDao = new ArticuloDao();		
		Articulo[] articulos = articuloDao.findAll();

		
		SociosDao socioDao  = new SociosDao();		
		Socios[] socis = socioDao.findAll();
	}

}
