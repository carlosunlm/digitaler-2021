package com.digitalers.clase7;

public class Logaritmo extends Calculo implements IOperacion {

	@Override
	public Double calcular(Double valor1, Double valor2) throws InvalidOperationException {		
		
		super.validar(valor1,valor2);
		
		if(valor1 < 0) {
			throw new InvalidOperationException("Debe ser mayoy a 0");
		}
		
		return Math.log(valor1);
	}
}
