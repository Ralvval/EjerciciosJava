package com.politecnicomalaga.ejercicioscondicionalesbucles;

import java.util.Scanner;

public class Ej3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero par");
        int par = scan.nextInt();
        System.out.println("Introduce un numero impar");
        int impar = scan.nextInt();
        
        if(par % 2 == 0 && impar % 2 != 0){
            System.out.println("Gracias por su colaboracion!");
        }else if(par % 2 != 0 && impar % 2 != 0){
            System.out.println("No ha escrito un numero par");
            System.out.println("Ejecute de nuevo el programa para volver a intentarlo");
        }else if(par % 2 == 0 && impar % 2 == 0){
            System.out.println("No ha escrito un numero impar");
            System.out.println("Ejecute de nuevo el programa para volver a intentarlo");
        }else{
            System.out.println("No ha escrito un numero par");
            System.out.println("No ha escrito un numero impar");
            System.out.println("Ejecute de nuevo el programa para volver a intentarlo");
        }
        
        
    }
    
}
