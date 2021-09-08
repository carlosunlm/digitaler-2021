package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Articulo;

public class Pelicula extends Articulo{

	private String productora;
	private String formato;
	
	public Pelicula(String titulo, String autor, Float precio, String productora, String formato) {
		super(titulo, autor, precio);
		this.productora = productora;
		this.formato = formato;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	@Override
	public void detalle() {
		System.out.println("Pelicula");
		super.detalle();
		System.out.println("Productora:" +this.productora);
		System.out.println("Formato:" +this.formato);
	}
}
