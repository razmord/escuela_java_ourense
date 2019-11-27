package com.vn.appusuarios.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySqlDB {
	public static final String URL_CONEXION="jdbc:mysql://localhost:3306/db_usuarios";
    public static final String USUARIO_DB="root";
    public static final String PASSWORD_DB="1234";
    public static boolean driversCargados=false;
    
    private static void cargarDrivers() throws SQLException, ClassNotFoundException {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
    }
    public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
    	if(! driversCargados) {
    		cargarDrivers();
    		//crearDBusuarios();
    		driversCargados=true;
    	}
    	return DriverManager.getConnection(URL_CONEXION,USUARIO_DB,PASSWORD_DB);
    }
    private static void crearDBusuarios() throws SQLException {
    	Connection conex = DriverManager.getConnection(URL_CONEXION,USUARIO_DB,PASSWORD_DB);
    	java.sql.Statement stmt = conex.createStatement();
    	String createTableSQL="CREATE TABLE usuario (\r\n" + 
    			"	id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY \r\n" + 
    			"		(START WITH 1, INCREMENT BY 1),\r\n" + 
    			"	email VARCHAR(255) NOT NULL,\r\n" + 
    			"	password VARCHAR(50) NOT NULL,\r\n" + 
    			"	nombre VARCHAR(50) NOT NULL,\r\n" + 
    			"	age INTEGER NOT NULL,\r\n" + 
    			"	CONSTRAINT primary_key PRIMARY KEY(id),\r\n" + 
    			"	CONSTRAINT unique_email UNIQUE(email)\r\n" + 
    			")";
    	stmt.executeUpdate(createTableSQL);
    	conex.close();
    }
    
}
