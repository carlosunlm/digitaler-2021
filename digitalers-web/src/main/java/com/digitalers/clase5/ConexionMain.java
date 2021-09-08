package com.digitalers.clase5;

public class ConexionMain {

	public static void main(String[] args) throws ConexionesExcedidasException {
		
		/*Conexion con = new Conexion(2);
		
		try {
			con.consultar();
		} catch (SinConexionException e) {
			e.printStackTrace();
			con.abrir();
		} finally {
			con.cerrar();
		}*/

		//esto ya no tiene sentido...
		//try-with-resources
		try(Conexion con2 = new Conexion(2)) {
			
			con2.abrir();
			con2.consultar();
			
		} catch (SinConexionException e) {
			e.printStackTrace();
		} catch (ConexionesExcedidasException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
