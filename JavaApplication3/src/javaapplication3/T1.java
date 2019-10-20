/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Camila Gavilán
 */
public class T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Expresion regular: ");
        String er = lectura.nextLine();
        
        System.out.print("Texto: ");
        String texto = lectura.nextLine();
        
        ResetearER reset = new ResetearER (er, texto);
        
        System.out.println("");
        System.out.println("Expresiones: ");
        int n=0;
        while (reset.getLineas().length>n){
            System.out.println(n+": "+reset.getLineas()[n]);
            n++;
        }
        System.out.println("");
        
        System.out.println("Completo: "+reset.getStringCompleto());
        System.out.println("Posiciones: ");
        for (int i = 0; i < reset.getPosicionesCadaLinea().size(); i++) {
            System.out.println("Impeimir posicionesCadaLinea: "+reset.getPosicionesCadaLinea().get(i));
        }
        
    
        
    }
    
}
