package com.digitalers.clase3.herencia.laboratorio;

public class TipoDocumento {

	private String tipoDocumento;//Enum
	private String numeroDocumento;
	
	public TipoDocumento(String tipoDocumento, String numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
}
