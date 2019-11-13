/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Equipo 5
 */
public class HilosSencillosMasivos extends HilosSencillos {
    static int numeroHilos=50;
    Set<Thread> setHiloA;
    Set<Thread> setHiloB;

    public HilosSencillosMasivos() {
        setHiloA = new HashSet<>();
        setHiloB = new HashSet<>();
    }
    
    @Override
    public void ejecutarHilosStartAB(){
        System.out.println("----THREAD START----");
        for (int i = 0; i < numeroHilos; i++)
            setHiloA.add(new Thread(new HiloA()));
        for (int i = 0; i < numeroHilos; i++)
            setHiloB.add(new Thread(new HiloB()));
        for (Thread threadA : setHiloA)
            threadA.start();
        for (Thread threadB : setHiloB)
            threadB.start();
        boolean vivo;
        do {
            vivo = false;
            for (Thread threadA : setHiloA) {
                vivo = threadA.isAlive() || vivo ;
            }
            for (Thread threadB : setHiloB) {
                vivo = threadB.isAlive() || vivo ;
            }
        } while(vivo);
    }
    @Override
    public void ejecutarHilosRunAB(){
        System.out.println("****THREAD START****");
         for(int i=0;i<numeroHilos;i++){
            Thread threadHiloA=new Thread(new HiloA());
            Thread threadHiloB=new Thread(new HiloB());
            threadHiloA.run();
            threadHiloB.run();
        }
    }
    
}
