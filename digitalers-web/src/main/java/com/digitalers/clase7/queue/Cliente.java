package com.digitalers.clase7.queue;

public class Cliente implements Comparable<Cliente>{

	private Integer edad;
	private String nombre;
	
	public Cliente(Integer edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//definir cual es orden natural Cliente
	// 0 ==
 	// < 0 
	// > 0
	public int compareTo(Cliente otroCliente) {
		//resta de edades
		//85 - 21 > 0
		//this.edad.compareTo(otroCliente.getEdad())
		return otroCliente.getEdad().compareTo(this.edad);
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	
}
