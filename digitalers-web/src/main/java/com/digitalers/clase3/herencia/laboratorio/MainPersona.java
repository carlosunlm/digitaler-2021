package com.digitalers.clase3.herencia.laboratorio;

public class MainPersona {

	public static void main(String[] args) {
		
		int cantidad = 2;
		
		Alumno[] alumnos = new Alumno[cantidad];

		Alumno carlos = new Alumno(1, "carlos", "lopez", new TipoDocumento("DNI", "123456798"), 35, null);
		
		Cursos[] cursos = new Cursos[1];
		cursos[0] = new Cursos("digitalers");
		
		//usar EL SETTER
		carlos.setCursos(cursos);
		
		
	}

}
