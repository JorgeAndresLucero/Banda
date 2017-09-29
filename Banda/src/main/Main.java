/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import FactoryMethod.*;

 /*
 * @author Jorge Andrés
 */
public class Main {
    
    public static void main (String args[]) {
        
        int numeroAleatorio = (int) (Math.random()*4+1);
        String[ ] banda = {"ROCK", "INSTRUMENTAL", "FOLKLOR", "SALSA"}; 
        System.out.println("SALIÓ A TOCAR LA BANDA DE: "+banda[numeroAleatorio]);
       
      
        
        

        
    }
}
