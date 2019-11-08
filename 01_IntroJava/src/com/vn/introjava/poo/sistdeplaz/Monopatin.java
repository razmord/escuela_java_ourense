/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.sistdeplaz;

import com.vn.introjava.poo.interfaces.Desplazable;

/**
 *
 * @author Equipo 5
 */
public class Monopatin implements Desplazable{
    @Override      
    public void mover(float metros){
        if(metros>1.25f&&metros<1.5f)
            saltar(metros);
        else
            rodar(metros);
    }
    public void saltar(float metros){
        System.out.println("El monopatin realiza un Ollie de "+metros+" metros");
    }
    public void rodar(float metros){
        System.out.println("El monopatin rueda "+metros+" metros");
    }
}
