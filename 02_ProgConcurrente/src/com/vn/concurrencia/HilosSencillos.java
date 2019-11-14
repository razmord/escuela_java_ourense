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
public class HilosSencillos {
    static int contadorCompartido;
    HiloA hiloA;
    HiloB hiloB;
    public HilosSencillos(){
         hiloA = new HiloA();
         hiloB = new HiloB();
    }
    class HiloA implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<5000;i++){
                contadorCompartido++;
                System.out.println("Instruccion A "+i+ " contador "+contadorCompartido);
               
            }
            System.out.println("Contador Final A "+contadorCompartido);
         }
    }
    class HiloB implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<8000;i++){
                contadorCompartido++;
                System.out.println("Inst### B "+i+ " contador "+contadorCompartido);
            }
            System.out.println("Contador Final B "+contadorCompartido);
        }
    }
    
    public void ejecutarHilosStartAB(){
        System.out.println("----THREAD START----");
        Thread threadHiloA=new Thread(hiloA);
        Thread threadHiloB=new Thread(hiloB);
        threadHiloA.start();
        threadHiloB.start();
        while(threadHiloA.isAlive()||threadHiloB.isAlive());
    }public void ejecutarHilosRunAB(){
        System.out.println("****THREAD START****");
        Thread threadHiloA=new Thread(hiloA);
        Thread threadHiloB=new Thread(hiloB);
        threadHiloA.run();
        threadHiloB.run();
    }
}
