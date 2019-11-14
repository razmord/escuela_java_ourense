/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sincronia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo 5
 */
public class Productor extends Thread implements Runnable{

    private Contenedor contenedor;

    public Productor(Contenedor c) {
        contenedor = c;
    }
    @Override
    public void run() {
        
      for(int i=0;i<10;i++){
        int valor=i*10;
        System.out.println("    Productor. ANTES DEL PUT: " +valor);
        contenedor.put(valor);
        System.out.println("Productor. PUT: " + valor);
       /* try {
            Thread.sleep((int)(Math.random()*1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
        }*/
      }
        
    }
}
