package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Articulo;

public class Musica extends Articulo{

	private String productora;
	private String[] temas;
	
	public Musica(String titulo, String autor, Float precio, String productora, String[] temas) {
		super(titulo, autor, precio);
		this.productora = productora;
		this.temas = temas;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String[] getTemas() {
		return temas;
	}

	public void setTemas(String[] temas) {
		this.temas = temas;
	}
		
	public void detalle() {
		System.out.println("Musica");
		super.detalle();
		System.out.println("Productora:"+ this.productora);
		System.out.println("Temas:");
		if(this.temas != null) {
			for(String tema : this.temas ) {
				System.out.println(tema);
			}
		}
	}
}
