package com.digitalers.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.digitalers.exception.GenericException;

public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws GenericException{
		
		String user  = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost/digitalers?serverTimeZone=UTC&useSSL=false";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		Connection connection = null;
		try {
			
			//crear una instancia del driver
			Class.forName(driverName);
			
			connection = DriverManager.getConnection(url, user, password);
			
			return connection;
		} catch (SQLException e) {
			throw new GenericException("No se ha podido obtener una conexion", e);
		} catch(ClassNotFoundException e) {
			throw new GenericException("No se ha encontrado la clase " + driverName, e);
		}
	}
}
