package com.digitalers.clase4;

public class Helicoptero extends Volador implements Aterrizable{

	private String color;
	
	public Helicoptero(String nombre) {
		super(nombre);
	}

	public String obtenerTipo() {
		return "HELICOPTERO";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ", Helicoptero [color=" + color + "]";
	}

	@Override
	public void aterrizar() {
		System.out.println(getNombre() + " Aterrizando...");
		System.out.println("Cuidado con las cabezas...");
	}

	
}
