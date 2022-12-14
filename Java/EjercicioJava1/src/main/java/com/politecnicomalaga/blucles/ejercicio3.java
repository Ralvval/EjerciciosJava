package com.politecnicomalaga.blucles;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();
        int i = 1;

        do {
            System.out.println(num * i);
            i++;
        } while (i <= 10);

    }

}
