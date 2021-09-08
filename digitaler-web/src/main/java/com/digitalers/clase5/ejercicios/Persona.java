package com.digitalers.clase5.ejercicios;

public class Persona {

	private String nombre;
	private String apellido;
	
	private IIDioma idiomaNativo;
	private IIDioma[] otrosIdiomas;
	
	public Persona(String nombre, String apellido, IIDioma idiomaNativo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.idiomaNativo = idiomaNativo;
		
		this.otrosIdiomas = new IIDioma[]{};
	}
	
	public void aprender(IIDioma nuevoIdioma) {
		//la copia de la lista actual
		IIDioma[] idiomasActuales = new IIDioma[this.otrosIdiomas.length + 1];
		
		for(int i=0; i< this.otrosIdiomas.length; i++) {
			idiomasActuales[i] = this.otrosIdiomas[i];  
		}
		
		idiomasActuales[idiomasActuales.length - 1] = nuevoIdioma;
		
		this.otrosIdiomas = idiomasActuales;		
	}
	
	public void hablar() {
		System.out.println(this.nombre + " - " + this.apellido);
		System.out.println("En idioma nativo:");
		this.idiomaNativo.hablar();
		
		//como habla los demas idiomas?
		System.out.println("Ademas habla:");
		
		for (IIDioma aux : otrosIdiomas) {
			aux.hablar();
		}
	}
	
	/**
	 * Implementar un metodo en Persona que permita decir una frase en el idioma enviado por parametro
	 * Si no habla dicho idioma, lanzar una Exception de tipo NoIdiomaException
	 * @param frase
	 * @param idioma
	 * @throws NoIdiomaException
	public void decir(String frase, IIDioma idioma)  throws NoIdiomaException{
				
		if(! sabeHablar() ) {
			throw new NoIdiomaException(this.nombre, this.apellido, frase, idioma);
		}
		
		aux.decir(frase);		
	}
	
	public boolean sabeHablar(IIDioma idioma) {
		
		if(this.idiomaNativo.getClass().equals(idioma.getClass())) {
			
		}
		
		for() {
			
		}
	}
	*/
}
