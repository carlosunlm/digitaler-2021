package com.digitalers.clase13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {

	public static void main(String[] args) {
		
		Collection<Integer> edades = new ArrayList<>();
		
		edades.add(10);
		edades.add(20);
		edades.add(30);
		edades.add(50);
		
		List<String> edadesString = edades.stream()
			.map(x-> new String("Edad" + x))
			.collect(Collectors.toList());
		
		System.out.println(edadesString);
		
		Integer edadAux = 12;
		
		List<Integer> edadesFiltradas = new ArrayList<>();
		
		//stream + lambda
		edadesFiltradas = edades.stream()
				.filter( x -> x > edadAux )
				.collect(Collectors.toList());
		
		System.out.println(edadesFiltradas);
		
		Integer suma = edades
				.stream()
				.filter(x -> x > 30)
				.map(x -> x*-1)
				.reduce(0, (x,y) -> x + y);
		
		System.out.println(suma);
	}

}
