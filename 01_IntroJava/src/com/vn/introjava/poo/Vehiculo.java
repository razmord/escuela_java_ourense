/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo;

/** Clase abstracta que no puede ser instanciada
 * Por falta de sentido
 *
 * @author pc
 */
public abstract class Vehiculo {
     
    protected TipoVehiculo tipo;

    public TipoVehiculo getTipo() {
        return tipo;
    }
    /**
     * Método declarado e implementado
     * @param tipo 
     */
    public void setTipo(TipoVehiculo tipo)  // Declaracion
    {                                       
        this.tipo = tipo;                   // Implementación
    }
    public abstract void avanzar();                  // Declaración
    

    public void mostrarEstado() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "tipo=" + tipo + '}';
    }

}