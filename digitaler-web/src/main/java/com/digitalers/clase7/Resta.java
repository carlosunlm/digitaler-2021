package com.digitalers.clase7;

public class Resta implements IOperacion {

	@Override
	public Double calcular(Double valor1, Double valor2) throws InvalidOperationException{
		if(valor1 == null || valor2 == null) {
			throw new InvalidOperationException("Los valores debe ser numericos");
		}
		
		return valor1 - valor2;
	}

}
