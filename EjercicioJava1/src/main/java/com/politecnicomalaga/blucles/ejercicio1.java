
package com.politecnicomalaga.blucles;

import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(num * i);
        }
    }
    
}
