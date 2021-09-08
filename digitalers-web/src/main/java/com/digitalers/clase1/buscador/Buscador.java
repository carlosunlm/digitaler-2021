package com.digitalers.clase1.buscador;

import com.digitalers.clase3.herencia.Libro;
import com.digitalers.clase3.herencia.Musica;
import com.digitalers.clase3.herencia.Pelicula;

public class Buscador {

	//atributos
	private String clave;
	private Articulo[] articulos;
	private Integer cantidad;
	
	//constructor/es
	public Buscador() {
		this.clave = "";
		this.cantidad = 0;
		this.articulos = new Articulo[] {}; 
	}
	
	public Buscador(String clave) {
		this.clave = clave;
		this.cantidad = 0;
		this.articulos = new Articulo[] {};
	}
	
	public void buscar() {
		
		//simular la carga de una lista de articulos
		
		//select * from articulos
		
		//crear Articulos y agregarlo a un vector
		Articulo articulo1 = new Libro("TONY STARK IRON MAN 02 RE...", "SLOTT, DAN", 910f, "1234",5);
		
		String[] temas = new String[] {"1-uno","2-dos"};
		
		Articulo articulo2 = new Musica("INVENCIBLE IRON MAN, EL ...", "SLOTT, DAN", 1700f, "sony", temas);
		
		Articulo articulo3 = new Pelicula("Iron man 3", "Autor xyz", 2500f, "Netflix","BLUERAY");
				
		Articulo[] resultados = new Articulo[] {articulo1,articulo2, articulo3};
		
		this.articulos = resultados;
		
		this.cantidad = articulos.length;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Articulo[] getArticulos() {
		return articulos;
	}
	
	//alt+sfhit+s
	public boolean hayResultados() {
		return this.cantidad > 0;
	}
	
	public Integer getCantidad() {
		return this.cantidad;
	}
}
