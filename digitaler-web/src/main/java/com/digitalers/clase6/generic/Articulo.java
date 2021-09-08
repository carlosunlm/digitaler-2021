package com.digitalers.clase6.generic;

public class Articulo implements Comparable<Articulo>{

	private Long id;
	private Float precio;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	//== 0
	//>  0
	//<  0
	public int compareTo(Articulo o) {
		return o.getPrecio().compareTo(this.precio) ;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	
}
