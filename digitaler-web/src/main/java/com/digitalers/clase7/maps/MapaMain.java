package com.digitalers.clase7.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapaMain {

	public static void main(String[] args) {
		//crear
		Map<Integer, String> dias = new HashMap<>();
		
		//cargar put(k,v)
		dias.put(1, "Lunes");
		dias.put(2, "Martes");
		dias.put(3, "Miercoles");
		dias.put(4, "Jueves");
		dias.put(5, "Viernes");
		dias.put(6, "Sabado");
		dias.put(7, "Domingo");
			
		//obtener
		String dia = dias.get(4);
		System.out.println("4 es " + dia);
		System.out.println("------------------------------------");
		//todas las claves de un mapa
		Set<Integer> diasKeys = dias.keySet();
		for(Integer diaNumerico : diasKeys) {
			dia = dias.get(diaNumerico); 
			System.out.println(diaNumerico + "es " + dia);
		}
		
		//ya sabemos recorrer colecciones!!!
		Collection<String> diasValues = dias.values();
		
		//ya sabemos recorrer colecciones!!!
		System.out.println("------------------------------------");
		//obtengo de a pares
		Set<Entry<Integer,String>> entrySet = dias.entrySet();
		for(Entry<Integer,String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " - " + value);
		}
	}

}
