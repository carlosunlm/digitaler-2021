package com.digitalers.clase6;

public enum ColoresEnum {

	ROJO(1),
	AZUL(2);

	private Integer color;
	
	private ColoresEnum(Integer color) {
		this.color = color;
	}
	
	public Integer getColor() {
		return this.color;
	}
	
	public String toString() {
		return this.color.toString();
	}
}
