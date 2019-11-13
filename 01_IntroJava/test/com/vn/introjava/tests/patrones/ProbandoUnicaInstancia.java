/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.patrones;

import com.vn.introjava.patrones.CocheEspecialUnico;
import com.vn.introjava.patrones.TractorSingleton;
import com.vn.introjava.poo.TipoVehiculo;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Equipo 5
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProbandoUnicaInstancia {
    
    public ProbandoUnicaInstancia() {
    }
    
    @Test
    public void intentarUnicaInstancia() throws Exception{
        CocheEspecialUnico miUnicoCoche= CocheEspecialUnico.getInstancia();
        miUnicoCoche.setMarca("Suzuki");
        miUnicoCoche.mostrarEstado();
        miUnicoCoche.arrancar();
        
    }@Test
    public void intentarUnicaInstancia2() throws Exception{
        CocheEspecialUnico miUnicoCoche= CocheEspecialUnico.getInstancia();
        miUnicoCoche.setMarca("Toyota");
        miUnicoCoche.mostrarEstado();
        
    }
    @Test
    public void intentarUnicaInstancia3() throws Exception{
        CocheEspecialUnico miUnicoCoche= CocheEspecialUnico.getInstancia(); 
        miUnicoCoche.setMarca("Mazda");
        miUnicoCoche.mostrarEstado();
        
    }
     @Test
    public void intentarTractorInstancia() throws Exception{
        TractorSingleton tractor=TractorSingleton.getInstancia();
        tractor.mostrarEstado();
        System.out.println("Tractor 1 color:"+tractor.getColor());
        tractor.setColor("amarillo");
        TractorSingleton tractor2=TractorSingleton.getInstancia();
        System.out.println("Tractor 2 color:"+tractor2.getColor());
        
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
