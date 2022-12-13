package com.politecnicomalaga.ejercicioscondicionalesbucles;

import java.util.Scanner;

public class Ej2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero par");
        int a = scan.nextInt();
        if (a % 2 == 0){
            System.out.println("Introduce un numero impar");
            a = scan.nextInt();
            if (a % 2 != 0){
                System.out.println("Gracias por su colaboracion");
            }else{
                System.out.println("No ha escrito un numero impar");
                System.out.println("Ejecute de nuevo el programa para volver a intentarlo");
            }
        }else{
            System.out.println("No ha escrito un numero par");
            System.out.println("Ejecute de nuevo el programa para volver a intentarlo");
        }
        
    }
    
}
