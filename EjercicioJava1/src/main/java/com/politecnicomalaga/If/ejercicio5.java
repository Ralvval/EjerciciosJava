package com.politecnicomalaga.If;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Introduzca primer número: ");
        a = scan.nextInt();
        System.out.print("Introduzca segundo número: ");
        b = scan.nextInt();
        System.out.print("Introduzca tercer número: ");
        c = scan.nextInt();

        if (a >= b && b >= c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a >= c && c >= b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b >= a && a >= c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b >= c && c >= a) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (c >= a && a >= b) {
            System.out.println(c + ", " + a + ", " + b);
        } else if (c >= b && b >= a) {
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}
