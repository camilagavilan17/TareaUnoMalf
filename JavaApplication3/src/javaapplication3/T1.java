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
      
        Scanner lectura = new Scanner(System.in);
        String expresion;
        String texto;
        
        expresion = lectura.nextLine();
        texto = lectura.nextLine();
        
        Validacion validacion = new Validacion(expresion,texto);
        validacion.generarLineasTexto();
        //validacion.imprimirLineasTexto();
        
        
        
    }
    
}
