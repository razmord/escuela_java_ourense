/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.liboperaarrays;

/**
 *
 * @author Equipo 5
 */
public class OperarArrays {
    
    @FunctionalInterface
    public interface FunCallbackOperarArrays{
    
    double operar(double x,double y);
    
    }
    
    //COORDENADAS
    @FunctionalInterface
    public interface FunCallbackOperarObjetos{
    
        Object operar(Object x,Object y);
    
    }
    
    
    public static double[]  operarArrays(double arrayX[],double arrayY[],FunCallbackOperarArrays operaCllbk){
        
        double[] arrayResult=null;
        if(arrayX.length==arrayY.length){
    
        arrayResult=new double[arrayX.length];
        
        for(int i=0;i<arrayX.length;i++){
        
        
        arrayResult[i]= operaCllbk.operar(arrayX[i],arrayY[i]);
                       
            System.out.println(arrayResult[i]);
            
        }
        }
    
        return arrayResult;
    }
    
    
    //COORDENADAS
     public static Object[]  operarArraysCoordenadas(Object arrayX[],Object arrayY[],FunCallbackOperarObjetos operaCllbk){
        
        Object[] arrayResult=null;
        if(arrayX.length==arrayY.length){
    
        arrayResult=new Object[arrayX.length];
        
        for(int i=0;i<arrayX.length;i++){
        
        arrayResult[i]=operaCllbk.operar(arrayX[i],arrayY[i]);
                       
            System.out.println(arrayResult[i]);
            
        }
        }
    
        return arrayResult;
    }
    
       
}