package com.digitalers.clase4;

public class Avion extends Volador implements Aterrizable, IProcedimiento {

	private String marca;
	
	public Avion(String nombre) {
		super(nombre);
	}

	public String obtenerTipo() {
		return "AVION";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String toString() {
		return super.toString() + ", Avion [marca=" + marca + "]";
	}

	public void aterrizar() {
		//acá va la magia del avion!
		System.out.println("Comienza el aterrizaje de " + super.getNombre());
		System.out.println("desplegando ruedas...");
		System.out.println("fin!");
	}

	@Override
	public void analizarEstado() {
		System.out.println("Analizando el estado de " + getNombre());
	}

	@Override
	public void accionar() {
		System.out.println("Avion accionando....");		
	}
	
	
}
