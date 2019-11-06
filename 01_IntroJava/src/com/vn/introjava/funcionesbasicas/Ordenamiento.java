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
public class Ordenamiento {
     public static int[] ordenarArray(int[] vector) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = vector.length - 1; j > i; j--) {
                if (vector[i] > vector[j]) {
                    int aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                    contador++;
                }
                System.out.print("Array ordenado 1= ");
                    for (int ix = 0; ix < vector.length; ix++) {
                        System.out.print(vector[ix] + " ");
                    }
                System.out.println("    - Contador = " + contador);
            }
        }
        return vector;
        }
      /*  public static int[] ordenarArray(int[] vector) {
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = vector.length - 1; j > i; j--) {
                if (vector[i] > vector[j]) {
                    int aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                    contador++;
                }
                System.out.print("Array ordenado 1= ");
                    for (int ix = 0; ix < vector.length; ix++) {
                        System.out.print(vector[ix] + " ");
                    }
                System.out.println("    - Contador = " + contador);
            }
        }
        return vector;
        }*/
        public static void ordenarArrayB() {
        //Declarar array entero
        //Programar para ordenadarlo
        int vector[] = {322, 77, 123, 34, 2, 50, 3,6,4,1,5,8,1,2,13,7,9,23,4,44,33,21,67,322, -1,22,34,51,32,234,4,432,555,321};
        int vector2[] = {322, 77, 123, 34, 2, 50, 3,6,4,1,5,8,1,2,13,7,9,23,4,44,33,21,67,322, -1,22,34,51,32,234,4,432,555,321};
        int vector3[] = {322, 77, 123, 34, 2, 50, 3,6,4,1,5,8,1,2,13,7,9,23,4,44,33,21,67,322, -1,22,34,51,32,234,4,432,555,321};
        System.out.print("\nArray sin ordenar = ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = vector.length - 1; j > i; j--) {
                if (vector[i] > vector[j]) {
                    int aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = aux;
                    contador++;

                    System.out.print("Array ordenado 1= ");
                    for (int ix = 0; ix < vector.length; ix++) {
                        System.out.print(vector[ix] + " ");
                    }
                    System.out.println("    - Contador = " + contador);
                }
            }
        }
        // NO FUNCIONA BIEN EL ALGORITMO, LOS TIROS VAN 
        // POR SABER SI SE HA HECHO UN CAMBIO O NO. SI NO, ARRAY -> ORDENADO
        int contador2 = 0;
        for (int i = vector3.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if ((vector3[j] > vector3[j+1])) {
                    int aux = vector3[j];
                    vector3[j] = vector3[j + 1];
                    vector3[j + 1] = aux;
                    contador2++;
                    System.out.print("Array ordenado 2= ");
                    for (int ix = 0; ix < vector2.length; ix++) {
                        System.out.print(vector2[ix] + " ");
                    }
                    System.out.println("    - Contador 2 = " + contador2);
                }
            }
        }
         int contador3 = 0;
        for (int i = 0; i < vector2.length; i++) {
            for (int j = vector2.length - 1; j > i; j--) {
                if ((vector2[i] > vector2[j])) {
                    int aux = vector2[j];
                    int aux2 = vector2[i];
                    vector2[j] = vector2[i + 1];
                    vector2[i + 1] = aux2;
                    vector2[i] = aux;
                    contador3++;
                    System.out.print("Array ordenado 3= ");
                    for (int ix = 0; ix < vector2.length; ix++) {
                        System.out.print(vector2[ix] + " ");
                    }
                    System.out.println("    - Contador 3 = " + contador3);
                    j++;
                }
            }
        }
        System.out.print("\nArray ordenado 1= ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }System.out.print("\nArray ordenado 2= ");
        for (int i = 0; i < vector3.length; i++) {
            System.out.print(vector3[i] + " ");
        }
        System.out.print("\nArray ordenado 3= ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.println("\nContador = " + contador);
        System.out.println("Contador 2 = " + contador2);
        System.out.println("Contador 3 = " + contador3);
    }
}
