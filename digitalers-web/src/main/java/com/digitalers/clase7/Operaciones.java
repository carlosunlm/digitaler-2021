package com.digitalers.clase7;

import java.util.HashMap;
import java.util.Map;

public class Operaciones {
						//K              V
	private static Map<OperacionEnum, IOperacion> operaciones;
	
	static {
		operaciones = new HashMap<>();
		//cargamos el mapa
		operaciones.put(OperacionEnum.SUMA,new Suma());
		operaciones.put(OperacionEnum.RESTA, new Resta());
		operaciones.put(OperacionEnum.LOG, new Logaritmo());
		//mas operaciones....
	}
	
	public static IOperacion getOperacion(OperacionEnum operacionEnum) {
		
		IOperacion operacion = operaciones.get(operacionEnum); 
				
		if(operacion == null) {
			throw new NullPointerException("No existe la operacion o es nula");
		}
		
		return operacion;
	}
}
