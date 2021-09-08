package com.digitalers.clase4;

public class CreadorDeVoladores {

	//metodo de clase
	public static Volador[] crearVoladores() {
		Avion avion1 = new Avion("avion1");		
		//quiero setear en avion la marca????
		avion1.setMarca("marca avion 1");
		
		Helicoptero helicoptero1 = new Helicoptero("helicoptero1");		
		helicoptero1.setColor("color " + helicoptero1.getNombre() +" 1: rojo");
		
		Superman superman1 = new Superman("superman1");
		superman1.setUsaCapa(true);
		
		Ovni ovni1 = new Ovni("ovni1");
		ovni1.setForma("circular");
		
		Volador[] voladores = new Volador[] {avion1,helicoptero1,superman1, ovni1};
		return voladores;
	}
}
