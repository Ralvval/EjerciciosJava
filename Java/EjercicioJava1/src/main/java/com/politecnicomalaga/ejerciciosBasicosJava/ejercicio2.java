package com.politecnicomalaga.ejerciciosBasicosJava;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int x = scan.nextInt();
        System.out.println("Introduce el segundo numero");
        int y = scan.nextInt();
        
        System.out.println("La suma de los dos valores es: " + (x + y) );
        System.out.println("La resta de los dos valores es: " + (x - y) );
        System.out.println("La division de los dos valores es: " + (x / y) );
        System.out.println("La multiplicacion de los dos valores es: " + (x * y) );
    }
}
