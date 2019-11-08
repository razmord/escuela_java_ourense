/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.poo.sistdeplaz;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.interfaces.Electrico;

/**
 *
 * @author Equipo 5
 */
public class CocheElectrico extends Coche implements Desplazable, Electrico{

    @Override
    public void cargarBateria(double voltios) {
        System.out.println("Se ha cargado la batería del monopatin y tiene un voltaje de "+voltios+"V.");
    }
    
}
