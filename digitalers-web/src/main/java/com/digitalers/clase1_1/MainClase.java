package com.digitalers.clase1_1;

import com.digitalers.clase1.Auto;

public class MainClase {

	public static void main(String[] args) {
				
		//USO EL OTRO constructor
		Auto clio = new Auto("RENAULT", "CLIO", 150f);
				
		//clio.velocidadMaxima = 1200f;
		
		clio.encender();
		
		while(clio.puedeAcelerar()) {
			clio.acelerar();
		}
		
		System.out.println(clio.obtenerMarca() + "-" + clio.obtenerModelo() +" llego a la velocidad "+ clio.obteneVelocidadActual());
	}

}
