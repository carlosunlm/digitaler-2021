package com.digitalers.clase3.herencia.laboratorio;

import java.util.Arrays;

public class Alumno extends Persona {

	private Cursos[] cursos;
	
	//contructor!
	public Alumno(Integer id, String nombre, String apellido, TipoDocumento documento, Integer edad, Cursos[] cursos) {
		//nace al padre!
		super(id, nombre, apellido, documento, edad);
		//los propios!
		this.cursos = cursos;
	}

	//ctrl+d
	public Cursos[] getCursos() {
		return cursos;
	}

	public void setCursos(Cursos[] cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return super.toString() + "Alumno [cursos=" + Arrays.toString(cursos) + "]";
	}
	
	
}
