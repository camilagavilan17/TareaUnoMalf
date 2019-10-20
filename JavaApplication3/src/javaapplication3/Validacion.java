/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Camila Gavilán
 */
public class Validacion {
    
   String exp;
   String tex;
   ArrayList <String> lienasTex;

    public Validacion(String exp, String tex) {
        this.exp = exp;
        this.tex = tex;
        this.lienasTex = new ArrayList <>();
    }  
   
    public ArrayList <String> generarLineasTexto (){
        if(this.tex.contains("-")){
            String [] lineas = this.tex.split("-");
            this.lienasTex.addAll(Arrays.asList(lineas));
        }
        else{
            this.lienasTex.add(this.tex);
        }
        return this.lienasTex;
    }
    
    public void imprimirLineasTexto (){
        for (int i = 0; i <this.lienasTex.size(); i++) {
            System.out.println("Linea N°"+i+" "+this.lienasTex.get(i)+"\n");
        }
    }
   
}
