
package com.politecnicomalaga.ejercicioscondicionalesbucles;

import java.util.Scanner;

public class Ej6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int M = scan.nextInt();
        System.out.println("Introduce un MIN");
        int MIN = scan.nextInt();
        System.out.println("Introduce un MAX");
        int MAX = scan.nextInt();
        System.out.print("Resultado: ");
        for(int i=0;MIN<MAX;i++){
            if (i >= MIN && i % M == 0){
                System.out.print(i+",");
                MIN = i;
            }
        }
    }
    
}
