package com.digitalers.clase6;

public class EnumMain {

	public static void main(String[] args) {
		
		Exportador exportador = new Exportador();
		
		//exportador.exportar("un formato super raro");
		
		//invocando al exportar pero que espera un enum
		exportador.exportar(null);
	}
}
