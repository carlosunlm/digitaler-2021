package com.digitalers.clase1.buscador;

public class Articulo {

	protected String titulo;
	protected String autor;
	protected Float precio;
	protected String imagen;
	
	//alt+shit+s
	public Articulo(String titulo, String autor, Float precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	public void detalle() {
		System.out.println("Titulo:" + this.getTitulo());
		//no siempre se informa el autor
		if(this.getAutor() != null) {
			System.out.println("Autor:" + this.getAutor());
		}
		
		System.out.println("Precio:" + this.getPrecio());
	}
}
