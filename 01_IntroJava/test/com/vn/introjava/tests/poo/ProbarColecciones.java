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
    @Test
    public void testearMetodosGenericos(){
        ArrayList<Integer> listaInt=new ArrayList<Integer>();
        int tres= 3;
        insertarDuplicado(listaInt, tres);
        insertarDuplicado(listaInt, 5);
        System.out.println("Tres sigue siendo "+tres);
        for (Integer integer : listaInt){
            System.out.println(" - )"+ integer);
        }
        ArrayList<String> listaStr=new ArrayList<String>();
        insertarDuplicado(listaStr, "tres");
        insertarDuplicado(listaStr, "cinco");
        for (String integer : listaStr){
            System.out.println("** )"+ integer);
        }
        System.out.println(obtenerUltimo(listaStr));
        ArrayList<Coche> listaCar=new ArrayList<Coche>();
        insertarDuplicado(listaCar, new Coche("Mazda RX-7"));
        insertarDuplicado(listaCar, new Coche("Toyota Corolla"));
        for (Coche integer : listaCar){
            System.out.println("** )"+ integer.toString());
        }
        System.out.println(obtenerUltimo(listaCar).toString());
    }
    static <T> void insertarDuplicado(ArrayList<T> listaGenerica, T objeto){
        listaGenerica.add(objeto);
        listaGenerica.add(objeto);
        System.out.println(objeto+" añadido dos veces");
        if(objeto instanceof Integer){
            Integer i = (Integer) objeto;
            i=i+2;
        }
        listaGenerica=null;
    }
    
    //Metodo genérico que reciba un ArrayList<Tipo>, que lo muestre (foreach) y devuelva el último valor
    static <T> T obtenerUltimo(ArrayList<T> listaGenerica){
        T devolver=null;
        for (T tipo : listaGenerica) {
            System.out.println("-"+tipo);
            devolver=tipo;
        }
        return devolver;
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
