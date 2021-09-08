package com.digitalers.clase5;

public class Conexion implements AutoCloseable {

	private Boolean abierta;//null|true|false
	
	private Integer cantidadMaximaConexiones;
	
	private static Integer conexionesAbiertas = 0; 

	public Conexion(Integer cantidadMaximaConexiones) {
		this.abierta = Boolean.FALSE;
		this.cantidadMaximaConexiones = cantidadMaximaConexiones;
	}
	
	public void consultar() throws SinConexionException{
		
		if(!this.abierta) {
			throw new SinConexionException();
		}
		
		System.out.println("Ejecutanto consulta sql...");
	}
	
	//si el metodo puede lanzar -> throws <>
	public void abrir() throws ConexionesExcedidasException{
		if(Conexion.conexionesAbiertas < this.cantidadMaximaConexiones) {
			this.abierta = Boolean.TRUE;
			Conexion.conexionesAbiertas++;
		}else {
			throw new ConexionesExcedidasException();
		}
	}
	
	public void cerrar() {
		this.abierta = Boolean.FALSE;
		Conexion.conexionesAbiertas = 0;
		System.out.println("se han cerrado todas las conexiones");
	}

	public void close() throws Exception {
		this.cerrar();
	}
}
