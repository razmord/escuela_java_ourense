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
public class DaoCocheList implements DaoCoche {
    
    private List<Coche> listaCoches;
    
    public DaoCocheList(){
        listaCoches=new ArrayList();
    }
    @Override
    public void crear(Coche coche) throws Exception{
        listaCoches.add(coche);
    }
    @Override
    public Coche obtenerPorIndice(int i){
       return listaCoches.get(i);
    }
    @Override
    public Coche obtenerPorMarca(String marca){
        for(Coche coche : listaCoches){
            if(coche.getMarca().equals(marca)){
                return coche;
            }
        }
        return null;
    }

    @Override
    public void modificar(Coche o,int index) throws Exception {
        listaCoches.get(index).setMarca(o.getMarca());
        listaCoches.get(index).arrancar(o.isArrancado()?4:1);}

    @Override
    public void eliminar(int index) throws Exception {
       listaCoches.remove(index);
    }

}
