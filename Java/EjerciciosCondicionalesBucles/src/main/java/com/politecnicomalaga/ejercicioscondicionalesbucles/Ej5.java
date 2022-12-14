package com.politecnicomalaga.ejercicioscondicionalesbucles;

import java.util.Scanner;

public class Ej5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma=0;
        System.out.println("Introduce un numero");
        int N = scan.nextInt();
        for(int i=1;i<=N;i++){
            suma = suma + i;
        }
        System.out.println("El resultado es: "+suma);
        
    }
}
