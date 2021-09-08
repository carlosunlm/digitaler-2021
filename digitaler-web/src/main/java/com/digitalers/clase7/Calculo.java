package com.digitalers.clase7;

public class Calculo {

	public void validar(Double valor1, Double valor2) throws InvalidOperationException {
		if(valor1 == null || valor2 == null) {
			throw new InvalidOperationException("Los valores debe ser numericos");
		}
	}
}
