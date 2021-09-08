package com.digitalers.clase5;

public class Calculadora {

	private String operacion;
	private Double valor1;
	private Double valor2;
	private Double resultado;
	
	public Calculadora() {
		
	}
	
	public Calculadora(Double valor1, Double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public Calculadora(String operacion, Double valor1, Double valor2) {
		this.operacion = operacion;
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public Calculadora(String operacion) {
		this.operacion = operacion;
	}
		
	//metodos
	//ESTE METODO PUEDE LANZAR UNA DivisionException
	public void dividir() throws DivisionException{
		
		//¿puedo realizar la division?
		
		if(this.valor2 == null || this.valor2.equals(0d)) {
			
			//acá que hago?
			
			//creo la exception
			DivisionException ex = new DivisionException("No se puede dividir por 0");
			
			throw ex;
		}
		
		//desde acá puedo terminar la logica de este metodo		
		setResultado(this.valor1 / this.valor1);		
	}

	private void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getResultado() {
		return resultado;
	}

	@Override
	public String toString() {
		return "Calculadora [operacion=" + operacion + ", valor1=" + valor1 + ", valor2=" + valor2 + ", resultado="
				+ resultado + "]";
	}
	
	
	
	
}
