/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo.dao;

import com.vn.appusuarios.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo 6
 */
public class DaoUsuario implements IDaoUsuario {


    @Override
    public Usuario crear(String email, String password, String nombre, int edad) {
        try(Connection conex = ConexionMySqlDB.obtenerConexion()) {
            String sqlQuery = "INSERT into usuario (email, password, nombre, edad) values (?,?,?,?)";
            PreparedStatement sentenciaSQL = conex.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, email);
            sentenciaSQL.setString(2, password);
            sentenciaSQL.setString(3, nombre);
            sentenciaSQL.setInt(4, edad);
            sentenciaSQL.executeUpdate();
            return obtenerPorEmail(email);
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }


    @Override
    public Usuario obtenerPorId(int id) {
        try (Connection conex = ConexionMySqlDB.obtenerConexion()){
            String sqlQuery = "SELECT email, password, nombre, edad FROM usuario WHERE id= ?";
            PreparedStatement sentenciaSQL = conex.prepareStatement(sqlQuery);
            sentenciaSQL.setInt(1, id);
            ResultSet resultado = sentenciaSQL.executeQuery();
            while (resultado.next()) {
                Usuario usuario = new Usuario(
                        id,
                        resultado.getString("email"),
                        resultado.getString("password"),
                        resultado.getString("nombre"),
                        resultado.getInt("edad"));

                System.out.println("ID: " + id + " Email: " + resultado.getString("email")
                        + " Password: " + resultado.getString("password") + " Nombre: " 
                        + resultado.getString("nombre") + " Edad: " + resultado.getInt("edad"));
                
                sentenciaSQL.close();
                return usuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }

    @Override
    public Usuario obtenerPorEmail(String email) {

        try (Connection conex = ConexionMySqlDB.obtenerConexion()){
            String sqlQuery = "SELECT id, email, password, nombre, edad FROM usuario WHERE email = ?";
            PreparedStatement sentenciaSQL = conex.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, email);
            ResultSet resultado = sentenciaSQL.executeQuery();
            while (resultado.next()) {
                Usuario usuario = new Usuario(
                        resultado.getInt("id"),
                        resultado.getString("email"),
                        resultado.getString("password"),
                        resultado.getString("nombre"),
                        resultado.getInt("edad"));
                sentenciaSQL.close();
                return usuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return null;
    }

    @Override
    public List<Usuario> obtenerTodos() {

        try(Connection conex = ConexionMySqlDB.obtenerConexion()) {

            String sqlQuery = "SELECT * FROM usuario";
            PreparedStatement sentenciaSQL = conex.prepareStatement(sqlQuery);
            ResultSet resultado = sentenciaSQL.executeQuery();
            List<Usuario> lista = new ArrayList<Usuario>();

            while (resultado.next()) {

                System.out.println("Id: " + resultado.getInt("id") + " Nombre: " + resultado.getString("nombre") + " Email: " + resultado.getString("email"
                        + "Edad: " + resultado.getInt("edad")));

                lista.add(new Usuario(resultado.getInt("id"), resultado.getString("email"), resultado.getString("password"), resultado.getString("nombre"), resultado.getInt("edad")));

            }
            sentenciaSQL.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }

    @Override
    public Usuario modificarPorId(int id, String email, String password, String nombre, int edad) {

        try(Connection conex = ConexionMySqlDB.obtenerConexion()) {

            String sqlQuery = "UPDATE usuario SET email=?,password=?,nombre=?,edad=? WHERE id=?";
            PreparedStatement sentenciaSQL = conex.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, email);
            sentenciaSQL.setString(2, password);
            sentenciaSQL.setString(3, nombre);
            sentenciaSQL.setInt(4, edad);
            sentenciaSQL.setInt(5, id);

            sentenciaSQL.executeUpdate();
            System.out.println("El usuario ha sido actualizado por id");

            Usuario usuario = new Usuario(id, email, password, nombre, edad);
            sentenciaSQL.close();

            return usuario;

        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return null;
    }

    @Override
    public Usuario modificar(Usuario usuarioNuevosDatos) {

        try(Connection conex = ConexionMySqlDB.obtenerConexion()) {

            String sqlQuery = "UPDATE usuario SET email=?,password=?,nombre=?,edad=? WHERE id=?";
            PreparedStatement sentenciaSQL = conex.prepareStatement(sqlQuery);
            sentenciaSQL.setString(1, usuarioNuevosDatos.getEmail());
            sentenciaSQL.setString(2, usuarioNuevosDatos.getPassword());
            sentenciaSQL.setString(3, usuarioNuevosDatos.getNombre());
            sentenciaSQL.setInt(4, usuarioNuevosDatos.getEdad());
            sentenciaSQL.setInt(5, usuarioNuevosDatos.getId());

            sentenciaSQL.executeUpdate();

            System.out.println("El usuario ha sido actualizado por usuario");

            Usuario usuario = new Usuario(usuarioNuevosDatos.getId(), usuarioNuevosDatos.getEmail(), usuarioNuevosDatos.getPassword(), usuarioNuevosDatos.getNombre(), usuarioNuevosDatos.getEdad());
            sentenciaSQL.close();
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return null;
    }

    @Override
    public boolean eliminarPorId(int id) {

        try (Connection conex = ConexionMySqlDB.obtenerConexion()){
            String sqlQuery = "DELETE  FROM usuario WHERE id=?";
            PreparedStatement sentenciaSQL = conex.prepareStatement(sqlQuery);
            sentenciaSQL.setInt(1, id);
            sentenciaSQL.executeUpdate();

            System.out.println("El usuario ha sido eliminado");
            sentenciaSQL.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return false;
    }
}
