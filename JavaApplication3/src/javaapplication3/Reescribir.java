/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Reescribir {
    String [] expresiones;
    String [] lineas; //strings separados por "-"
    String completo =""; //un unico string sin el "-"
    List <Integer> posicionesCadaLinea = new ArrayList<>(); //largo de cada linea separada
    List <Integer> posicionesCompleto = new ArrayList<>(); //ubicacion de los fines de los string separados, pero en el string completo
    List <Integer> ocurrencias = new ArrayList<>(); //posicion final de donde se encuentra el "er" en el "texto" ("er" sin punto)
    List <Integer> ocurrenciaPorLinea = new ArrayList<>(); //




    public String[] getLineas() {
        return lineas;
    }
    
    public String getStringCompleto() {
        return completo;
    }

    public List<Integer> getPosicionesCadaLinea() {
        return posicionesCadaLinea;
    }

    public Reescribir(String er, String texto) {
        this.expresiones = er.split("c");
        for (int i = 0; i < expresiones.length; i++) {
            System.out.println("AAA: "+expresiones[i]+" i: "+i);
        }
        int n=0;
        /*
        int cant=0;
        while (er.length()>n){  //separar string de "-"
            if (er.charAt(n)=='-'){
                cant++;
            }
            n++;
        }
        */
        this.lineas = texto.split("-"); //guardamos cada linea del texto inicial en "lineas"
        for (int i = 0; i < lineas.length; i++) {
            System.out.println("BBB: "+lineas[i]+" i: "+i);
        }
        n=0;
        while (lineas.length>n){ //unir cada linea en un solo String... "completo"
            completo+=lineas[n];
            n++;
        }
        
        n=0;
        int numero;
        while (lineas.length>n){ //guardamos el largo de cada linea (tiene que ver con Ocurrencias)
            numero = lineas[n].length();
            posicionesCadaLinea.add(numero);
            n++;
        }
        numero=0;
        for (int i = 0; i < posicionesCadaLinea.size(); i++) {
            numero=posicionesCadaLinea.get(i).intValue() + numero;
            posicionesCompleto.add(numero);
        }
        for (int i = 0; i < posicionesCompleto.size(); i++) {
            System.out.println("Imprimir posicionesCompleto: "+posicionesCompleto.get(i));
        }
        String corte;
        int largoER;
        
        for (int i = 0; i < expresiones.length; i++) {
            largoER = expresiones[i].length();
            System.out.println("Largoooooo "+largoER);
            System.out.println("LA EXPRESION DE BUSQUEDA ES "+expresiones[i]);
            //cortamos el string completo para ver la relacion con la expresion regular ("er")
            for (int j = 0; j < (completo.length()-largoER+1); j++) {
                
                corte = completo.substring(j, j+largoER);
                System.out.println("Corte "+corte);
                if (corte.equals(expresiones[i])){
                    ocurrencias.add(j+largoER);
                    System.out.println("Expresion: "+i+" --- OCURRENCIA: "+(j+largoER));
                }
            }
        }
        /*
        for (int i = 0; i < lineas.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (ocurrencias.get(j)<lineas[i].length()){
                    ocurrenciaPorLinea.add(i);
                }
            }
            
            for (int j = 0; j < 10; j++) {
                
            }
            //////////////////////////
        }
        */
        
    }
    
    public boolean revisarExpresion (String expresion){
        int n=0;
        boolean valido=true;
        while (expresion.length()>n){  //separar string de "-"
            if (n%2==0 && expresion.charAt(n)=='.' && expresion.charAt(n)=='|' 
                    && expresion.charAt(n)=='*' && expresion.charAt(n)=='_' && expresion.charAt(n)=='0'){
                valido = false;
            }
            else if (n%2==1 && expresion.charAt(n)!='.' && expresion.charAt(n)!='|' 
                    && expresion.charAt(n)!='*' && expresion.charAt(n)!='_' && expresion.charAt(n)!='0'){
                valido = false;
            }
            n++;
        }
        return valido;
    }
}
