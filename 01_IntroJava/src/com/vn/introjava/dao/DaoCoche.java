/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;

/**
 *
 * @author Equipo 5
 */
public interface DaoCoche extends IGenericDao<Coche>{


    Coche obtenerPorMarca(String marca);
    
}
