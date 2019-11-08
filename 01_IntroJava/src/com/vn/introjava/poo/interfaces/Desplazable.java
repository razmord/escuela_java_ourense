/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.interfaces;

/** La forma en que se comunican las clases que la implementan
 * Es como una clase abstracta
 * @author Equipo 5
 */
public interface Desplazable {
    
    
    //No se deben usar variables miembro en interfaces
    
    //Unicamente declaracion de métodos
    public void mover(float metros);
    
   // public void mover(int metros);
    
    //public void detener();
}
