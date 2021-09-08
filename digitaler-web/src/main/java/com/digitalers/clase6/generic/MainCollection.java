package com.digitalers.clase6.generic;

import java.util.Iterator;
import java.util.TreeSet;

public class MainCollection {

	public static void main(String[] args) {
		
		TreeSet<Articulo> nombres = new TreeSet<>();

		//agregar elemento a una lista
		nombres.add(new Articulo());
		
		//mostrar los valores de la lista
		for(Articulo nombre  : nombres) {
			System.out.println(nombre);
		}
		
		Iterator<Articulo> itNombre = nombres.iterator();
		while(itNombre.hasNext()) {
			Articulo nombre = itNombre.next();			
			itNombre.remove();
		}
	}

}
