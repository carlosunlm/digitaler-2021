package com.digitalers.clase5.ejercicios;

public class IdiomasMain {

	public static void main(String[] args) {
				
		IIDioma idioma = new Espanol();
		
		Persona yamila = new Persona("yamila", "Moha", idioma); 

		yamila.hablar();
		
		System.out.println("-------------");
		
		idioma = new Portugues();
		
		yamila.aprender(idioma);
		
		yamila.hablar();
		
		System.out.println("-------------");
		
		idioma = new Ingles();
		
		yamila.aprender(idioma);
		
		yamila.hablar();
	}

}
