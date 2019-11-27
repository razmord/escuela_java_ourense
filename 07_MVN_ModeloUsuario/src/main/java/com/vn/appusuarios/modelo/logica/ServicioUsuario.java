/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo.logica;

import com.vn.appusuarios.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Equipo 5
 */
public interface ServicioUsuario {

    Usuario crear(String email, String password, String nombre, String edad);

    boolean eliminarPorId(String id);

    Usuario modificar(Usuario usuarioNuevosDatos);

    Usuario modificarPorId(String id, String email, String password, String nombre, String edad);

    Usuario obtenerPorEmail(String email);

    Usuario obtenerPorId(String id);

    List<Usuario> obtenerTodos();
    
}
