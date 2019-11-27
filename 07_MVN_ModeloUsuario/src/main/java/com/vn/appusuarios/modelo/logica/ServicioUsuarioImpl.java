/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo.logica;

import com.vn.appusuarios.modelo.Usuario;
import com.vn.appusuarios.modelo.dao.DaoUsuario;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author Equipo 5
 */
public class ServicioUsuarioImpl implements ServicioUsuario {

    DaoUsuario dao = new DaoUsuario();
    ChivatoServicios chivato;
    
    void setChivatoListener(ChivatoServicios chivato){
         this.chivato = chivato;
    }
     void notificarError(String mensajeError) {
        
        System.out.println("Error ServicioUsuario:  " + mensajeError);
        if (chivato != null) {
            chivato.notificarError(mensajeError);
        }
    }

    public int validarId(String id) {
        if (id.length() >= 1) {
            return Integer.parseInt(id);
        }
        return -1;
    }

    public boolean validarNombre(String nombre) {
        if (nombre.length() > 1 && nombre.length() <= 50) {
            return true;
        }
        return false;
    }

    public boolean validarEmail(String email) {
        if (email.length() > 1 && email.length() <= 255 && Pattern.matches("^(.+)@(.+)$", email)) {
            return true;
        }
        return false;
    }

    public boolean validarPassword(String password) {
        if (password.length() >= 4 && password.length() <= 50) {
            return true;
        }
        return false;
    }

    public boolean validarEdad(String edad) {
        if (Integer.parseInt(edad) > 12) {
            return true;
        }
        return false;
    }

    @Override
    public Usuario crear(String email, String password, String nombre, String edad) {
        if (validarEmail(email) && validarPassword(password) && validarNombre(nombre) && validarEdad(edad)&&(obtenerPorEmail(email)==null)) {
            return dao.crear(email, password, nombre, Integer.parseInt(edad));
        }
        return null;
    }

    @Override
    public Usuario obtenerPorId(String id) {
        int i = validarId(id);
        if (i > 0) {
            return dao.obtenerPorId(i);
        }
        return null;
    }

    @Override
    public Usuario obtenerPorEmail(String email) {
        if (validarEmail(email)) {
            return dao.obtenerPorEmail(email);
        }
        return null;
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return dao.obtenerTodos();
    }

    @Override
    public Usuario modificarPorId(String id, String email, String password, String nombre, String edad) {
        int i = validarId(id);
        if (validarEmail(email) && validarPassword(password) && validarNombre(nombre) && validarEdad(edad) && i > 0 &&((obtenerPorEmail(email)==null)||(i==obtenerPorEmail(email).getId()))) {
            return dao.modificarPorId(i, email, password, nombre, Integer.parseInt(edad));
        }
        return null;
    }

    @Override
    public Usuario modificar(Usuario usuarioNuevosDatos) {
        return dao.modificar(usuarioNuevosDatos);
    }

    @Override
    public boolean eliminarPorId(String id) {
        int i = validarId(id);
        if (i > 0) {
            return dao.eliminarPorId(i);
        }
        return false;
    }
}
