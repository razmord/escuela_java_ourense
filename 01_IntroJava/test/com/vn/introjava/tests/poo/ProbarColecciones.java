/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 5
 */
public class ProbarColecciones {
    
    public ProbarColecciones() {
    }
    
    @Test
    public void testArrayListNoGenericaMUY_MAL(){
        ArrayList lista = new ArrayList();
        lista.add(new Object());
        lista.add(new Coche("Coche"));
        lista.add("Texto cualquiera");
        lista.add(100);
        
        for (int i = 0;i < lista.size(); i++)
        {
            System.out.println("Elem ["+i+"] = "+lista.get(i).toString());
        }}
    @Test
    public void testArrayListGenericoOK(){
        ArrayList<CocheRally> misCoches = new ArrayList<>();
        misCoches.add(new CocheRally("Subaru Lunes"));
        misCoches.add(new CocheRally("Toyota Martes"));
        misCoches.add(new CocheRally("Hammer Finde"));
        
        misCoches.get(2).arrancar("encender");
        misCoches.get(2).mostrarEstado();
        
        for (CocheRally misCoche : misCoches) {
            misCoche.avanzar();
        }
        
        }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
