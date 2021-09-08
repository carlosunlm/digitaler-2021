package com.digitalers.clase1;

public class Auto {

	//atributos
	String marca;
	String color;
	String modelo;
	Integer chasis;
	private Float velocidadMaxima;
	Float velocidadActual;
	Boolean nuevo;
	Boolean encendido;
	
	//TODOS LOS CONSTRUCTORES TIENE EL MISMO NOMBRE
	//contructor/es: por defecto o sea sin parametros
	public Auto() {
		this.encendido = false;
		this.color = "gris";
		this.velocidadMaxima = 150f;
		this.velocidadActual = 0f;
		
		System.out.println("creando un auto...");
		
	}
	
	public Auto(String nuevaMarca, String nuevoModelo, Float nuevaVelociadaMaxima) {
		this.encendido = false;
		this.marca = nuevaMarca;
		this.modelo = nuevoModelo;
		this.velocidadMaxima = nuevaVelociadaMaxima;
		this.velocidadActual = 0f;
	}
	
	//metodos/acciones
	public void encender() {
		if(!encendido) {			
			encendido = true;
			System.out.println("Se ha encendido el auto...");
		}else 
			System.out.println("El auto YA esta encendido");
	}
	
	void apagar() {
		if(encendido) {
			this.encendido = false;
			System.out.println(this.marca + " - " + this.modelo + " se ha apagado" );
		}else {
			System.out.println(this.marca + " - " + this.modelo + " YA se ha apagado" );
		}
	}
	
	void frenar() {
		if(this.encendido) {
			System.out.println(this.marca + " - " + this.modelo + " velocidad=" +this.velocidadActual );
			if(this.velocidadActual > 0) {
				this.velocidadActual--;
			}else {
				System.out.println(this.marca + " - " + this.modelo + " ya no puede frenar.");
			}
		}else {
			System.out.println(this.marca + " - " + this.modelo + " esta apagado" );
		}
	}
	
	public void acelerar() {
		
		if(this.encendido) {
			if(this.velocidadActual < this.velocidadMaxima) {
				this.velocidadActual++;
			}else {
				System.out.println(this.marca + " - " + this.modelo + " ya no puede acelerar.");	
			}
			System.out.println(this.marca + " - " + this.modelo + " velocidad=" +this.velocidadActual );
		}else {
			System.out.println(this.marca + " - " + this.modelo + " esta apagado" );
		}
	}
	
	public Float obteneVelocidadActual() {
		return this.velocidadActual;
	}
	
	Float obtenerVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public String obtenerMarca() {
		return this.marca;
	}
	
	public String obtenerModelo() {
		return this.modelo;
	}
	
	public Boolean puedeAcelerar() {
		return this.encendido && this.velocidadActual < this.velocidadMaxima;		
	}
	
	void informarEstado() {
		
	}
}
