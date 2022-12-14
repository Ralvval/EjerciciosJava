package com.mycompany.pruebas;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) throws InterruptedException {
        Crono crono;
        crono = new Crono();
        Scanner scan = new Scanner(System.in);
        java.awt.event.KeyEvent evt = null;

        System.out.println("1.Cuenta hacia adelante");
        System.out.println("2.Cuenta hacia atras");
        int i = scan.nextInt();
        if (i == 1) {
            crono.adelante();
        } else if (i == 2) {
            while (true) {
                System.out.println("Introduce las horas que quieras contar");
                int horas = scan.nextInt();
                System.out.println("Introduce los minutos que quieras contar");
                int minutos = scan.nextInt();
                System.out.println("Introduce las segundos que quieras contar");
                int segundos = scan.nextInt();
                crono.atras(horas, minutos, segundos);
                }
            }
        }
    }
