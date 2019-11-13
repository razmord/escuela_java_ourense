/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo 5
 */
public class DaoUsuarioList implements DaoUsuario {
    private List<Usuario> listaUsuarios;
    
    public DaoUsuarioList(){
        listaUsuarios=new ArrayList();
    }
    
   
    @Override
    public void crear(Usuario usuario) throws Exception{
        listaUsuarios.add(usuario);
    }
    
    
    @Override
    public Usuario obtenerPorIndice(int i){
       return listaUsuarios.get(i);
    }
    
   
    @Override
    public Usuario obtenerPorNombre(String nombre){
        for(Usuario usuario : listaUsuarios){
            if(usuario.getNombre().equals(nombre)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void modificar(Usuario o,int index) throws Exception {
        listaUsuarios.get(index).setEdad(o.getEdad());
        listaUsuarios.get(index).setNombre(o.getNombre());
    }

    @Override
    public void eliminar(int index) throws Exception {
        listaUsuarios.remove(index);
    }
}
