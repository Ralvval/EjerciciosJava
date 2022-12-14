package com.politecnicomalaga.ejercicioscondicionalesbucles;

import java.util.Scanner;

public class Ej4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero par");
        int par = scan.nextInt();
        if(par % 2 != 0){
            System.out.println("No ha escrito un numero par");
        }
        System.out.println("Introduce un numero impar");
        int impar = scan.nextInt();
        if(impar % 2 == 0){
            System.out.println("No ha escrito un numero impar");
        }
        if(par % 2 == 0 && impar % 2 != 0){
            System.out.println("Gracias por su colaboracion");
        }
        if(par % 2 != 0 || impar % 2 == 0){
            System.out.println("Ejecute de nuevo el programa para volver a intentarlo");
        }
        
    }
    
}
