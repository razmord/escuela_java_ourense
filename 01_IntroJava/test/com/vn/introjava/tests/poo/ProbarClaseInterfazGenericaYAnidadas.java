/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import java.util.HashMap;
import java.util.Map.Entry;
import org.junit.Test;

/**
 *
 * @author Equipo 5
 */
public class ProbarClaseInterfazGenericaYAnidadas {
    public static class ClasePequePos<T>{
        T x, y;
        public ClasePequePos(T x,T y){
            this.x=x;
            this.y=y;
        }   
        @Override
        public String toString() {return "(x = "+x.toString()+", y = "+y.toString()+")";}
    }
    @Test
    public void probarClaseAnidada(){
        ClasePequePos unPunto2D = new ClasePequePos(3f,5f);
        System.out.println("PUNTO 2D: "+unPunto2D.toString());
        ClasePequePos<String> unPunto2Dstr = new ClasePequePos("Predator","Ranger");
        System.out.println("PUNTO 2D: "+unPunto2Dstr.toString());
    }
    @Test
    public void probarMapas(){
        HashMap<String,ClasePequePos> hashMap = new HashMap<String,ClasePequePos>();
        ClasePequePos tft1 = new ClasePequePos("Inferno","Mage");
        ClasePequePos tft2 = new ClasePequePos("Shadow","Berseker");
        ClasePequePos tft3 = new ClasePequePos("Cloud","Blademaster");
        ClasePequePos tft4 = new ClasePequePos("Desert","Assassin");

        hashMap.put("Brand", tft1);
        hashMap.put("Sion", tft2);
        hashMap.put("Yasuo", tft3);
        hashMap.put("Kha'Zix", tft4);

        System.out.println("Tamaño del hashmap:"+hashMap.size());
        for (Entry<String,ClasePequePos> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString());
        }
    
    }
}
