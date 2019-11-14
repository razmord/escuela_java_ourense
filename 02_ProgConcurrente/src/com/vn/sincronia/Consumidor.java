/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.sincronia;

/**
 *
 * @author Equipo 5
 */
public class Consumidor extends Thread implements Runnable{
    private Contenedor contenedor;

    public Consumidor(Contenedor c) {
        contenedor = c;
    }
    @Override
    public void run() {
        int value = 0;
        for(int i=0;i<10;i++){
            value = contenedor.get();
            System.out.println("Consumidor. GET: " + value);
        }
    }
}