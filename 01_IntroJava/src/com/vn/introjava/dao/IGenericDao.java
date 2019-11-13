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
public interface IGenericDao<T> {
    void crear(T objetoNuevo) throws Exception;
    T obtenerPorIndice(int index);
    void modificar(T objExistente,int index) throws Exception;
    void eliminar(int index) throws Exception;
}
