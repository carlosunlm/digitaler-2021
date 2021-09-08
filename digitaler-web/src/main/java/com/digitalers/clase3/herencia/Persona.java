package com.digitalers.clase3.herencia;

public class Persona {

	//ESTO ES UN ATRIBUTO DE INSTANCIA
	private String nombre;
	
	//ESTO ES UN ATRIBUTO DE CLASE
	public static Integer cantidadOjos = 2;
	
	public final static String especie = "HUMANO";

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
