package com.digitalers.clase5;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		
		try(Scanner teclado = new Scanner(System.in)) {
			
			Double valor1 = 100d;
			System.out.println("Ingrese valor2");
			Double valor2 = teclado.nextDouble();
			
			Calculadora calculadora = new Calculadora(valor1, valor2);
			
			calculadora.dividir();
		}catch(DivisionException de) {
			//que sucedio
			de.printStackTrace();
		}finally {
			//siempre cerrar el teclado!!!
			//teclado.close();
		}
	}

}
