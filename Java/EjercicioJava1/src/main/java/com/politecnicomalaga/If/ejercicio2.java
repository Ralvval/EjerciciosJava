package com.politecnicomalaga.If;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7 para saber el dia de la semana");
        int dia = scan.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
            case 2:
                System.out.println("Martes");
            case 3:
                System.out.println("Miercoles");
            case 4:
                System.out.println("Jueves");
            case 5:
                System.out.println("Viernes");
            case 6:
                System.out.println("Sabado");
            case 7:
                System.out.println("Domingo");

        }
    }

}
