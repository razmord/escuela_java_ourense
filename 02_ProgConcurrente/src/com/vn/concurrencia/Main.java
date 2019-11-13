/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

/**
 *
 * @author Equipo 5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hilosMasivos();
    }
    static void hilosMasivos(){
        HilosSencillosMasivos hs;
        hs = new HilosSencillosMasivos();
        long timeIni=System.currentTimeMillis();
        hs.ejecutarHilosStartAB();
        mostrarTiempo(timeIni, "Start en paralelo ha tardado ");
        //timeIni=System.currentTimeMillis();
        //hs.ejecutarHilosRunAB();
        //mostrarTiempo(timeIni, "Run en serie ha tardado ");
    }
    static void hilosSimples(){
        HilosSencillos hs=new HilosSencillos();
        long timeIni=System.currentTimeMillis();
        hs.ejecutarHilosStartAB();
        mostrarTiempo(timeIni, "Start en paralelo ha tardado");
        timeIni=System.currentTimeMillis();
        hs.ejecutarHilosRunAB();
        mostrarTiempo(timeIni, "Run en serie ha tardado");
    }
    static void mostrarTiempo(long timeInicial, String mensaje){
        double tiempo = ((double)System.currentTimeMillis()-timeInicial)/1000f;
        System.out.println(mensaje + tiempo);
    }

  
    
}
