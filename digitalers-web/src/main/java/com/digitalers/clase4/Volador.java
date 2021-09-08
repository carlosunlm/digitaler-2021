package com.digitalers.clase4;

public abstract class Volador {

	protected String nombre;	
	
	//tiene constuctor!
	public Volador(String nombre) {
		this.nombre = nombre;
	}
	
	//si existe al menos una metodo abstracto entonces la clase debe ser abstracta
	public abstract String obtenerTipo();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//otro metodo implentado
	public String toString() {
		return "Volador [nombre=" + nombre + "]";
	}
	
	
}
