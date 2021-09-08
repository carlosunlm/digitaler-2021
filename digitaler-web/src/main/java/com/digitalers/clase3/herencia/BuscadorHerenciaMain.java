package com.digitalers.clase3.herencia;

import com.digitalers.clase1.buscador.Articulo;
import com.digitalers.clase1.buscador.Buscador;

public class BuscadorHerenciaMain {

	public static void main(String[] args) {
	
		Articulo articulo = new Libro("titulo","autor",1000f, "123456", 100);
				
		//me voy a quedar con el Libro que esta dentro del Articulo
		
		Libro elLibroDentroDelArticulo = (Libro)articulo;
		
		Articulo articuloMusica = new Musica("ac/dc","ac/dc",1500f,"warner",new String[] {});
	
		//casteo
		Musica laMusicaDentroDelArticulo = (Musica)articuloMusica;
		
		Articulo[] todos = new Articulo[]{articulo, elLibroDentroDelArticulo, articuloMusica, laMusicaDentroDelArticulo};
		
		for(Articulo unArticulo  : todos ) {
			articulo.detalle();
		}
	}

}
