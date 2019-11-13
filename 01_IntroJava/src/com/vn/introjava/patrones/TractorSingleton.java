/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.patrones;

import com.vn.introjava.poo.Tractor;

/**
 *
 * @author Equipo 5
 */
public class TractorSingleton extends Tractor {
     private static TractorSingleton tractorSingleton;
     
    private String color;
    
    private TractorSingleton(){
        super();
    }
    public static TractorSingleton getInstancia(){
        if(TractorSingleton.tractorSingleton==null)
            TractorSingleton.tractorSingleton=new TractorSingleton();
        return TractorSingleton.tractorSingleton;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
