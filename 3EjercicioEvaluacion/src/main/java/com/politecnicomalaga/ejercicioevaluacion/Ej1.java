package com.politecnicomalaga.ejercicioevaluacion;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        int cerrados = 0, seguimiento = 0, mitigacion = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("(INCIBE)");
            System.out.println("Sistema de clasificacion de Tickets de deteccion temprana de Ciberdelincuencia:");
            System.out.println("    1. Realizar clasificacion");
            System.out.println("    2. Mostrar estadisticas");
            System.out.println("    Otro numero. Salir");
            int a = scan.nextInt();

            if (a == 1) {
                System.out.println("Es un ticket de emergencia?");
                System.out.println("1.Si");
                System.out.println("2.No");
                a = scan.nextInt();
                if (a == 1) {
                    mitigacion++;
                    System.out.println("Procedimiento de mitigacion");
                } else if (a == 2) {
                    System.out.println("Ha tenido respuesta?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    a = scan.nextInt();
                    if (a == 1) {
                        System.out.println("Se ha resuelto?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        a = scan.nextInt();
                        if (a == 1) {
                            cerrados++;
                            System.out.println("Ticket cerrado");
                        } else if (a == 2) {
                            seguimiento++;
                            System.out.println("Ticket en seguimiento");
                        } else {
                            System.out.println("Opcion incorrecta. Vuelva a intentar");
                        }
                    } else if (a == 2) {
                        System.out.println("Es de prioridad alta?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        a = scan.nextInt();
                        if (a == 1) {
                            mitigacion++;
                            System.out.println("Procedimiento de mitigacion");
                        } else if (a == 2) {
                            seguimiento++;
                            System.out.println("Ticket en seguimiento");
                        } else {
                            System.out.println("Opcion incorrecta. Vuelva a intentar");
                        }
                    } else {
                        System.out.println("Opcion incorrecta. Vuelva a intentar");
                    }
                } else {
                    System.out.println("Opcion incorrecta. Vuelva a intentar");
                }
            } else if (a == 2) {
                System.out.println("Estadisticas:");
                System.out.println("    - Cerrados: " + cerrados);
                System.out.println("    - En seguimiento: " + seguimiento);
                System.out.println("    - En mitigacion: " + mitigacion);
            } else {
                break;
            }

        }
    }
}
