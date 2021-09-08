package com.digitalers.clase7;

public class CalculadoraHTML {

	public static void main(String[] args) throws InvalidOperationException {
		
		//datos que vienen desde la pantalla
		Double valor1 = 10d;
		Double valor2 = 20d;		
		String oper = "log";
		
		//de aca en mas viene nustra solucion
		
		OperacionEnum operacionEnum = OperacionEnum.getValidEnum(oper);
		
		IOperacion operacion = Operaciones.getOperacion(operacionEnum);
		
		Double resultado = operacion.calcular(valor1, valor2);
		
		System.out.println(resultado);
	}

}
