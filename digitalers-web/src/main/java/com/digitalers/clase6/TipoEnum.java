package com.digitalers.clase6;

public enum TipoEnum {

	CSV("csv"),
	PDF("pdf"),
	XLS("xls");
	
	private String tipo;
		
	private TipoEnum(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}

	public static TipoEnum getEnum(String tipoIngresadoPorUsuario) {
		//ver los valores que tiene un ENUM
		TipoEnum[] tipos = TipoEnum.values();
		
		TipoEnum tipoValido = null;
		for( TipoEnum unEnum : tipos) {
			//PDF -> pdf
			//pdf -> pdf
			if(unEnum.getTipo().equalsIgnoreCase(tipoIngresadoPorUsuario)) {
				tipoValido = unEnum;
				break;
			}
		}
		return tipoValido;
	}
}
