package com.digitalers.clase7;

public enum OperacionEnum {

	SUMA("+"),
	RESTA("-"),
	MULTIPLICACION("*"),
	DIVISION("/"),
	LOG("log")
	;
	
	private String operacion;
	
	private OperacionEnum(String operacion) {
		this.operacion = operacion;
	}
	
	public String getOperacion() {
		return this.operacion;
	}
		
	public static OperacionEnum getValidEnum(String operacion) {
		
		if(operacion == null) {
			throw new IllegalArgumentException(operacion + "No es valida");
		}
		//busco si existe operacion en los valores del ENUM
		OperacionEnum retorno = null;
		for(OperacionEnum operacionEnum : OperacionEnum.values()) {
			if(operacionEnum.getOperacion().equals(operacion)) {
				retorno = operacionEnum;
				break;
			}
		}
		
		if(retorno == null) {
			throw new IllegalArgumentException(operacion + "no es una operacion valida");
		}
		
		return retorno;
	}
}
