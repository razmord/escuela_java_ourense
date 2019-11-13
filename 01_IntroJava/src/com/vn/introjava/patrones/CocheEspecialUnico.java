/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.patrones;

import com.vn.introjava.poo.Coche;

/**
 *
 * @author Equipo 5
 */
public class CocheEspecialUnico extends Coche {
    private static CocheEspecialUnico unicoCocheEsp;
    
    private CocheEspecialUnico(){
        super();
    }
    public static CocheEspecialUnico getInstancia(){
        if(CocheEspecialUnico.unicoCocheEsp==null)
            CocheEspecialUnico.unicoCocheEsp=new CocheEspecialUnico();
        return CocheEspecialUnico.unicoCocheEsp;
    }
}
