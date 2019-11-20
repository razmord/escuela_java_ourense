/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn;

/**
 *
 * @author Equipo 5
 */
public class WrapperPrimitivos {
    public static void EjemploInteger(){
    int varPrim=10;
    Object varInteger=new Integer(varPrim);
    System.out.println("Var Integer= "+varInteger.toString() );
    }
    public static void EjemploDouble(){
    double varPrim=10;
    Object varDouble=new Double(varPrim);
    System.out.println("Var Double= "+varDouble.toString() );
    }
     public static void EjemploString(){
    String varPrim="cadena string";
    Object varString=new String(varPrim);
    System.out.println("Var String= "+varString .toString() );
    }
    
}
