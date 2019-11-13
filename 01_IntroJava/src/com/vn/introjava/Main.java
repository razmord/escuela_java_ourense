/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;

import com.vn.introjava.excepciones.UsoNormalExcepciones;
import static com.vn.introjava.funcionesbasicas.DatosBasicos.*;
import com.vn.introjava.poo.Coche;
import com.vn.introjava.poo.FabricaCoches;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal del proyecto Ejemplos java
 *
 * @author pc
 */
public class Main {
public static void main(String[] args) {
        try {
            System.out.println("Tipos de datos");

            Coche c = FabricaCoches.crear("Seat en main");
            c.mostrarEstado();
            //return
           // c = FabricaCoches.crear(null);
            c = FabricaCoches.crear("Mazda RX");
            c.mostrarEstado();
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligro();
            Object objNulo = null;
            System.out.println("Fallará: "+objNulo.toString());
        }catch (IllegalArgumentException ex) {
            System.err.println(">> LOG ARGUMENTO ILEGAL: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (RuntimeException ex) {
            System.err.println(">> LOG RUNTIME: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            
        }catch (Exception ex) {
            System.err.println(">> LOG: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            System.out.println("***** FIN DEL TRYCATCH *****");
        }
        System.out.println("***** FIN DEL PROGRAMA *****");
        try{

        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Excepcion: "+ex.getMessage());
            System.out.println("\nPila de llamadas: "+Arrays.toString(ex.getStackTrace()));         
        }
        try{
            
        }catch(NullPointerException ex){
            System.err.println(">> LOG: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);;
        }
    }
    /**
     * Función que se ejectua al arrancar el programa
     *
     * @param args the command line arguments
     */
    public static void mainTryCatch(String[] args) {
//        mostrarTiposDatos();
//        EstructurasControl.ejecutarBucles();
//        EstructurasControl.ejecutarCondiciones();        
//        probarOperadores();
// Ordenarmiento.ordenarArray();
// Ordenarmiento.burbuja(null )

        try {
            System.out.println("Tipos de datos");

            Coche c = FabricaCoches.crear("Seat en main");
            c.mostrarEstado();
            c = FabricaCoches.crear(null);
            c.mostrarEstado();
        } catch (Exception ex) {
            System.err.println(">> LOG: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            UsoNormalExcepciones unObj = new UsoNormalExcepciones();
            unObj.metodoPeligro();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Excepcion: "+ex.getMessage());
            System.out.println("\nPila de llamadas: "+Arrays.toString(ex.getStackTrace()));         
        }
        try{
            Object objNulo = null;
            System.out.println("Fallará: "+objNulo.toString());
        }catch(NullPointerException ex){
            System.err.println(">> LOG: ");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);;
        }
    }

}