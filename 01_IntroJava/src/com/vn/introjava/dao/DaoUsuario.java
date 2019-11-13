/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

/**
 *
 * @author Equipo 5
 */
public interface DaoUsuario extends IGenericDao<Usuario>{
    

    Usuario obtenerPorNombre(String nombre);
    
}
