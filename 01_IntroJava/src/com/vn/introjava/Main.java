/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava;
import static com.vn.introjava.EstructurasControl.*;
import static com.vn.introjava.Ordenamiento.*;

public class Main {

    /**
     * Función que se ejecuta al arrancar el programa
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarTiposDatos();
        ejecutarBucles();
        condiciones();
        probarOperadores();
    }

    public static void mostrarTiposDatos() {
        System.out.println("Tipos de datos");
        byte unByte = -128;
        int unEntero = 1000; //4 bytes
        System.out.println("Byte: " + unByte);
        System.out.println("Entero: " + unEntero);
        long enteroLargo = 300000000000L; //8 bytes
        System.out.println("Largo: " + enteroLargo);
        float unDecimal = 1.23456789f;
        System.out.println("Flotante: " + unDecimal);
        double decimalDoblePrecision = 1.234567890123456789;
        System.out.println("Doble: " + decimalDoblePrecision);
        boolean condicion = true;
        char unCaracter = 'A';
        System.out.println("Caracter: " + unCaracter);
        char unCharEntero = 97;
        System.out.println("Caracter en numero: " + (int) unCaracter);
        System.out.println("Caracter Entero: " + unCharEntero);
        String unTexto = "Que esto es un txt";
        System.out.println("String: " + unTexto);
        System.out.println("En mayusculas: " + unTexto.toUpperCase());
    }

   

    public static void probarOperadores() {
        System.out.println("Negación: " + !true);
        System.out.println("Negativo: " + -(10 + 5));
        int contador = 10;
        System.out.println("Incremento: " + contador++);
        System.out.println("Suma y mult: " + ((5 + 5) * 2));

        System.out.println("Op. binario 21 AND 7 = " + (21 & 7));
        System.out.println("Op. binario 21 OR 7 = " + (21 | 7));
        System.out.println("Op. binario 21 XOR 7 = " + (21 ^ 7));
    }


}
