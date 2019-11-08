/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

import com.vn.introjava.poo.interfaces.Desplazable;

/**
 *
 * @author pc
 */
public class Tractor extends Vehiculo implements Desplazable{

    public Tractor() {
        super();
        tipo = TipoVehiculo.TRACTOR;
    }    
    
    @Override
    public void avanzar() {
        System.out.println("Ruedo y siego.");
    }    

    @Override      
    public void mover(float metros){
        avanzar();
    }
    @Override
    public String toString() {
        return "Tractor{"+ "tipo=" + tipo + '}';
    }
    
}
