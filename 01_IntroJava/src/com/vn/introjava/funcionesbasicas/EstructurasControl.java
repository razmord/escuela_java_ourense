/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.introjava.funcionesbasicas;

/**
 *
 * @author Equipo 5
 */
public class EstructurasControl {
 public static void ejecutarBucles() {
        char arrayChar[] = {'a', 'B', '8', '*'};
        int index = 0;
        while (index < arrayChar.length) {
            System.out.println("Index = " + index + ", char " + arrayChar[index]);
            index++;
        }
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println("Index = " + i + ", char " + arrayChar[i]);
        }
        index = 0;
        do {
            System.out.println("Index = " + index + ", char " + arrayChar[index]);
            index++;
        } while (index < arrayChar.length);
    }

    public static void condiciones() {
        if ("Palabra".length() > 5) {
            System.out.println("Palabra larga");
        }
        if ("Texto".length() > 5) {

        } else {
            System.out.println("Palabra corta");
        }
        if ("En un lugar de la mancha...".contains("LUGAR")) {
            System.out.println("Tiene LUGAR");
        } else if ("En un lugar de la mancha...".contains("mancha")) {
            System.out.println("Tiene mancha");
        } else if ("En un lugar de la mancha...".contains("otro")) {
            System.out.println("Tiene otro");
        } else {
            System.out.println("No tiene ninguno porque estan en mayusculas");
        }
        int numeroPeq = 0;
        switch (numeroPeq) {
            case 0:
                System.out.println("Vale cero");
                break;
            case 1:
                System.out.println("vale uno");
                break;
        }
    }
}
