package com.digitalers.clase4;

public class IMain {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		
		float f1 = 10.5f;
		float f2 = 11.5f;
		
		double d = 100.5;
		
		float[] valores = new float[] {a,b, f1, (float)d};
		
		// double > float > int > short > byte 
		
		
		Avion a1 = new Avion("a");
		Helicoptero h1 = new Helicoptero("h");
		
		Volador vx = new Ovni("");
		
		Volador[] aviones = new Volador[] {a1, h1};
		 
		
	}

}
