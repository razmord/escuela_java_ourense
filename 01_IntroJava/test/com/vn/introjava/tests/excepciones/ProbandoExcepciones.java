/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests.excepciones;

import com.vn.introjava.excepciones.UsoNormalExcepciones;
import java.util.Arrays;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 5
 */
public class ProbandoExcepciones {
    
    public ProbandoExcepciones() {
    }
    @Test
    public void gestionarExcepcion(){
        try{
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligro();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Excepcion: "+ex.getMessage());
            System.out.println("\nPila de llamadas: "+Arrays.toString(ex.getStackTrace()));
                    
                    
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
