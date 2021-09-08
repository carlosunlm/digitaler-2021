package com.digitalers.clase1.buscador;

public class BuscadorMain {

	public static void main(String[] args) {
		
		String claveBuscada = "iron man";
				
		Buscador miBuscador = new Buscador(claveBuscada);
		
		miBuscador.buscar();

		if(miBuscador.hayResultados()) {
			
			System.out.println("Hemos Encontrado "+miBuscador.getCantidad()+" Resultados Para '"+miBuscador.getClave()+"'");
			
			Articulo[] resultados = miBuscador.getArticulos();
			
			//foreach
			for(Articulo unArticulo : resultados) {
				unArticulo.detalle();		
				System.out.println("-------------");
			}
		}else {
			System.out.println("No se encontraron resultados. Por favor, prueba de nuevo con otras palabras.");
		}
	}

}

