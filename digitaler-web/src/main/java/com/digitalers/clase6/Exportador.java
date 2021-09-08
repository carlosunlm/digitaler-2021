package com.digitalers.clase6;

public class Exportador {

	/*public void exportar(String tipo) {
		
		if("c".equals(tipo))
			System.out.println("formato valido");
		else if("pdf".equals(tipo)) 
			System.out.println("formato valido");
		else if("xls".equals(tipo))
			System.out.println("formato valido");
		else 
			System.out.println("formato invalido");
	}*/
	
	public void exportar(TipoEnum tipo) {
		if(TipoEnum.CSV.equals(tipo) 
			|| TipoEnum.PDF.equals(tipo) 
				|| TipoEnum.XLS.equals(tipo)) {
			System.out.println("formato valido");
		}else {
			System.out.println("formato invalido");
		}
	}
}
