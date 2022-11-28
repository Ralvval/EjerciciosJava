
package com.politecnicomalaga.blucles;

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();
        int i = 1;
        
        while(i<=10){
            System.out.println(num * i);
            i++;
        }
        
    }
}
