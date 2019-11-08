/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.poo;

import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.CocheRally;
import com.vn.introjava.poo.Vehiculo;
import com.vn.introjava.poo.interfaces.Desplazable;
import com.vn.introjava.poo.interfaces.Electrico;
import com.vn.introjava.poo.sistdeplaz.Avion;
import com.vn.introjava.poo.sistdeplaz.CocheElectrico;
import com.vn.introjava.poo.sistdeplaz.MonopatinElectrico;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 5
 */
public class ProbarInterfaces {
    
    public ProbarInterfaces() {
    }
    @Test
    public void creandoDesplazables(){
        Avion miAvionDeLosLunes = new Avion();
        miAvionDeLosLunes.mover(50.1f);
        
        Desplazable d1=new Avion();
        d1.mover(0);
        Avion avionD1 = (Avion) d1;
        avionD1.volar(20f);
        assertTrue(d1 instanceof Avion);
    }
     @Test
    public void moviendoVehiculosDesplazables(){
       CocheRally cocheRally = new CocheRally("COCHE RALLY PROPIO 3D");
       Coche cocheR = cocheRally;
       Vehiculo vehiculoR = cocheRally;
       Desplazable desplazR = cocheRally;
       cocheR.arrancar();
       vehiculoR.mostrarEstado();
       desplazR.mover(10f);
       assertTrue(desplazR instanceof CocheRally);
       if(desplazR instanceof CocheRally)
           ((CocheRally) desplazR).setRozamiento(10f);
       assertEquals(((CocheRally) desplazR).getRozamiento(),10f,0.001f);
    }
    @Test
    void arrayInterfaces(){
        Electrico[] cosasElectricas =new Electrico[]{
            new MonopatinElectrico(),
            new CocheElectrico()
        }; 
        cosasElectricas[0].cargarBateria(4f);
        cosasElectricas[1].cargarBateria(12f);
        if(cosasElectricas.length!=2){
            fail("No tiene 2 elementos");
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
