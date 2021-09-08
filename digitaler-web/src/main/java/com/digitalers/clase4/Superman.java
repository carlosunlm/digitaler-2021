package com.digitalers.clase4;

public class Superman extends Volador implements Aterrizable{

	private Boolean usaCapa;
	
	public Superman(String nombre) {
		super(nombre);
	}

	public String obtenerTipo() {
		return "SUPERHEROE";
	}

	public boolean isUsaCapa() {
		return usaCapa;
	}

	public void setUsaCapa(boolean usaCapa) {
		this.usaCapa = usaCapa;
	}

	@Override
	public String toString() {
		return super.toString() + ", Superman [usaCapa=" + usaCapa + "]";
	}

	@Override
	public void aterrizar() {
		System.out.println("Superman bajando....");		
	}

	
}
