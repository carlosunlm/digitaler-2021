package com.digitalers.clase4;

public class Ovni extends Volador implements Aterrizable{

	private String forma;
	
	public Ovni(String nombre) {
		super(nombre);
	}

	@Override
	public String obtenerTipo() {
		return "DESCONOCIDO";
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String toString() {
		return super.toString() + ", Ovni [forma=" + forma + "]";
	}

	@Override
	public void aterrizar() {
		System.out.println(getNombre() + "bajando en area 51");		
	}

	
}
