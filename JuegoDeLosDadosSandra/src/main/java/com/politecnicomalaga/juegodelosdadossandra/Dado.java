
package com.politecnicomalaga.juegodelosdadossandra;

import java.util.Random;


public class Dado {
    int valor;
    Random aleatorio = new Random();
    
    public Dado(){
        valor=0;
    }
    public int tirarDado(){
        valor = aleatorio.nextInt(6)+1;
        return valor;
    }
    public int getValor(){
        return valor;
    }
}
