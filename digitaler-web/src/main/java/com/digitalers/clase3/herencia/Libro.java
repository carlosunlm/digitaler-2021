package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Articulo;

public class Libro extends Articulo{

	private String isbn;
	private Integer paginas;
	
	public Libro(String titulo, String autor, Float precio, String isbn,Integer paginas) {
		super(titulo, autor, precio);
		this.isbn = isbn;
		this.paginas = paginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	//polimorfismo
	public void detalle() {
		System.out.println("LIBRO");
		//padre que haga lo que saber hacer
		super.detalle();
		
		//hijo hace lo suyo!
		System.out.println("ISBN:" + this.isbn);
		System.out.println("Paginas:" + this.paginas);
	}
}
