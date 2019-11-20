/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn;

import com.vn.liboperaarrays.OperarArrays;
import static com.vn.liboperaarrays.OperarArrays.operarArraysCordenaadas;
import java.io.PrintStream;

/**
 *
 * @author Equipo 5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] array_A = {1,2,3,4,5};
        double[] array_B = {2,3,4,5,6};
        double[] arraySumaAB = OperarArrays.operarArrays(array_A, array_B, Main::suma);
        Object[] arrayPunto;
        arrayPunto = operarArraysCoordenadas(array_A, array_B, Main::suma);
        arrayEnTabla(System.out,arraySumaAB);
        
    }
    public static double suma(double x, double y){
        return x+y;
    }
    public static double multiplica(double x, double y){
        return x*y;
    }
    public static double resta(double x, double y){
        return x-y;
    }
    public static double dividir(double x, double y){
        return x/y;
    }
    
    public static void arrayEnTabla(PrintStream salida, double[] array){
    
        String tabla = "<table border=2><tr>\n";
        for (int index=0;index<array.length;index++){
            final double element = array[index];
            tabla +="<td>&nbsp"+element+"&nbsp</td>";
        }
        tabla+="</tr></table>";
        salida.println(tabla);
    }
}
