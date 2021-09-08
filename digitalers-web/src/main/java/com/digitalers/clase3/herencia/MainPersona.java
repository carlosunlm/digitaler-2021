package com.digitalers.clase3.herencia;

public class MainPersona {

	public static void main(String[] args) {


		Persona a = new Persona("persona a");
		Persona b = new Persona("persona b");
		
		a.getNombre();
		b.getNombre();

		System.out.println(a.cantidadOjos);
		System.out.println(b.cantidadOjos);
		
		System.out.println(Persona.cantidadOjos);
		
		Persona.cantidadOjos = 3;
		System.err.println("-------");
		System.out.println(a.cantidadOjos);
		System.out.println(b.cantidadOjos);
		
		System.out.println(Persona.cantidadOjos);
		
	}

}
