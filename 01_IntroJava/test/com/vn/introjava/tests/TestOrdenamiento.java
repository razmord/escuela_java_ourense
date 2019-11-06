/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.tests;

import static com.vn.introjava.funcionesbasicas.Ordenamiento.ordenarArray;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo 5
 */
public class TestOrdenamiento {
    
    public TestOrdenamiento() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    public void ordenarArrayBase(int[] array,int[] array2){
        assertArrayEquals(array2,ordenarArray(array));
    }
    @Test
    public void ordenarArrayTest_SoloDos(){
        ordenarArrayBase(new int[] {1,2},ordenarArray(new int[] {2,1}));
    }
        @Test
    public void ordenarArrayTest_MuchosValores(){
        ordenarArrayBase(new int[] {1,2,4,5,6,7,8,9,10,11,12},ordenarArray(new int[] {2,1,12,11,9,7,8,10,5,6,4}));
    }
        @Test
    public void ordenarArrayTest_ArrayInvertido(){
        ordenarArrayBase(new int[] {1,2,3,4},ordenarArray(new int[] {4,3,2,1}));
    }
        @Test
    public void ordenarArrayTest_ConNegativos(){
        ordenarArrayBase(new int[] {-2,1,4,5},ordenarArray(new int[] {5,4,-2,1}));
    }
        @Test
    public void ordenarArrayTest_ConRepetidos(){
        ordenarArrayBase(new int[] {1,2,2,3},ordenarArray(new int[] {2,3,2,1}));
    }
        @Test
    public void ordenarArrayTest_1elemento(){
        ordenarArrayBase(new int[] {1},ordenarArray(new int[] {1}));
    }
        @Test
    public void ordenarArrayTest_ConMaximos(){
        ordenarArrayBase(new int[] {1,2,2,3},ordenarArray(new int[] {2,3,2,1}));
    }    @Test
    public void ordenarArrayTest_ConMinimos(){
        ordenarArrayBase(new int[] {1,2,2,3},ordenarArray(new int[] {2,3,2,1}));
    }
    
    @Test
    public void probarOrdenamientoSistemaHumano(){
    int[] array={4,3,2,1};
    int[] arrayOrdenado={1,2,3,4};
    
    assertEquals(10,10);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
