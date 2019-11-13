/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.dao;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Equipo 5
 */
public class DaoCochesMap implements DaoCoche{
    private HashMap<String,Coche> mapaMarca;
    private HashMap<Integer,Coche> mapaIndice;
    private int contador;
    public DaoCochesMap(){
        mapaMarca=new HashMap();
        mapaIndice=new HashMap();
        contador=0;
    }
    public void crear(Coche c) throws Exception{
        mapaMarca.put(c.getMarca(),c);
        mapaIndice.put(contador,c);
        contador++;
    }
    public Coche obtenerPorIndice(int i){
       return mapaIndice.get(i);
    }
    public Coche obtenerPorMarca(String marca){
        return mapaMarca.get(marca);
    }

    @Override
    public void modificar(Coche o,int index) throws Exception {
        mapaMarca.remove(mapaIndice.get(index).getMarca());
        mapaMarca.put(o.getMarca(),o);
        mapaIndice.replace(index, o);
    }

    @Override
    public void eliminar(int index) throws Exception {
        mapaMarca.remove(mapaIndice.get(index).getMarca());
        mapaIndice.remove(index);
    }
    public void eliminar(Coche eliminar) throws Exception {
       String keyMarca = eliminar.getMarca();
       mapaMarca.remove(keyMarca);
       int keyIndex=-1;
       if (mapaIndice.containsValue(eliminar)){
           for(Map.Entry<Integer,Coche> parIndexYcoche : mapaIndice.entrySet()){
               if(parIndexYcoche.getValue() == eliminar){
                   keyIndex=parIndexYcoche.getKey();
               }
           }
       }
       mapaIndice.remove(keyIndex);
    }
}
