package com.digitalers.clase4;

public class MainVoladores {

	public static void main(String[] args) {
		
		Volador[] voladores = CreadorDeVoladores.crearVoladores();
		
		//logica de negocio
		
		for (Volador volador : voladores) {
			
			//determinar si volador puede aterrizar
			if(volador instanceof Aterrizable) {
								
				//castear
				 Aterrizable atr = (Aterrizable)volador;
				 
				 atr.aterrizar();
			}else {
				System.out.println(volador.getNombre() + ", no puede aterrizar");
			}
			
			if(volador instanceof IProcedimiento) {
				((IProcedimiento)volador).analizarEstado();
				
				((IAccion)((IProcedimiento)volador)).accionar();
			}
		}
	}

}
