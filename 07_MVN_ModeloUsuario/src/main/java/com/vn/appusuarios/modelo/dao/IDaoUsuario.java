/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.appusuarios.modelo.dao;

import com.vn.appusuarios.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Equipo 6
 */
public interface IDaoUsuario {
    
    public abstract Usuario crear(String email, String password, String nombre, int edad);
    
    public abstract Usuario obtenerPorId(int id);
    
    public abstract Usuario obtenerPorEmail(String email);
    
    public abstract List<Usuario> obtenerTodos();
    
    public abstract Usuario modificarPorId(int id, String email, String password, String nombre, int edad);
    
    public abstract Usuario modificar(Usuario usuarioNuevosDatos);
    
    public abstract boolean eliminarPorId(int id);
}
