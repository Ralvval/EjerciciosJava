package com.politecnicomalaga.ejerciciodeevaluacion;

import java.util.Scanner;

public class Ej3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);       
        
        System.out.println("Introduce un numero positivo: ");
        int N = scan.nextInt();
        for (int i=1;i<=N;i++){
            System.out.println(i+" "+(N-(i-1)));
        }
        
    }
    
}
