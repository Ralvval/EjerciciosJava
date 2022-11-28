package com.politecnicomalaga.If;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pon una hora cualquiera (numero entero, formato 24h): ");
        int hora = scan.nextInt();
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if (hora >= 21 && hora <= 5) {
            System.out.println("Buenas noches");
        }
    }

}
