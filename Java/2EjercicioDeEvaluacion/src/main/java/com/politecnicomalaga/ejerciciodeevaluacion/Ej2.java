package com.politecnicomalaga.ejerciciodeevaluacion;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0, fuera = 0, INF = 0, SUP = 0;
        boolean igual = false;

        while (true) {
            System.out.println("Introduce el limite inferior");
            INF = scan.nextInt();
            System.out.println("Introduce el limite superior");
            SUP = scan.nextInt();
            if (SUP > INF) {
                break;
            }
        }

        System.out.println("Introduce todos los numeros que quieras");
        System.out.println("Para terminar, ponga 0");
        while (true) {
            int a = scan.nextInt();
            if (a > INF && a < SUP) {
                suma = suma + a;
            } else if (a < INF && a != 0 || a > SUP && a != 0) {
                fuera++;
            }
            if (a == INF || a == SUP) {
                igual = true;
            }
            if (a == 0) {
                break;
            }
        }

        System.out.println("La suma de todos los numeros dentro del intervalo es: " + suma);
        System.out.println("Hay " + fuera + " numeros fuera del intervalo");
        if (igual = true) {
            System.out.println("Hay algun numero igual a los limites del intervalo que no cuenta en la suma");
        } else {
            System.out.println("No hay ningun numero igual a los limites del intervalo");
        }

    }

}
