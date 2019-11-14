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
public class Contenedor {
    // Normalmente será un array, lista, bb.dd., 
    // mapa, fichero, DAO, servicio web, cualquier recurso compartido...
        int dato;
    //Semaforo: false no se puede usar, true si se puede usar.
    boolean hayDato=false;
    public synchronized int get() {
        System.out.println("    Principio Get");
        while(hayDato==false){
            System.out.println("    GET: Esperando, hayDato "+hayDato);
            try{
                this.wait();
            }catch(InterruptedException ex){
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        hayDato=false; //Marcamos para bloquear el recurso.
        System.out.println("  >>Final get "+dato);
        this.notifyAll();
        return dato;
    }
    public synchronized void put(int valor) {
        System.out.println("    Principio Put "+valor);
        while(hayDato){
            System.out.println("    PUT: Esperando, hayDato "+hayDato);
            try{
                this.wait();
            }catch(InterruptedException ex){
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        dato = valor;
        hayDato=true;
        System.out.println("   <<Fin Put "+valor);
        this.notifyAll();
    }
}