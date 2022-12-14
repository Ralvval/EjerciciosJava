package com.politecnicomalaga.ejerciciodeevaluacion;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int negro = 0, rojo = 0, amarillo = 0, verde = 0;

        while (true) {
            System.out.println("Sistema de triaje urgencias hospitalarias:");
            System.out.println("    1. Realizar triaje");
            System.out.println("    2. Mostrar estadisticas");
            System.out.println("    (Cualquier tecla). Salir");

            int opt = scan.nextInt();
            if (opt == 1) {
                System.out.println("El paciente puede caminar?");
                System.out.println("1.Si");
                System.out.println("2.No");
                int a = scan.nextInt();
                if (a == 1) {
                    System.out.println("Prioridad 3 (verde)");
                    verde++;
                } else if (a == 2) {
                    System.out.println("El paciente respira?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    a = scan.nextInt();
                    if (a == 1) {
                        System.out.println("Tiene una FR(frecuencia respiratoria) mayor a 30 veces por minuto?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        a = scan.nextInt();
                        if (a == 1) {
                            System.out.println("Prioridad 1 (rojo)");
                            rojo++;
                        } else if (a == 2) {
                            System.out.println("Tiene pulso radial?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            a = scan.nextInt();
                            if (a == 1) {
                                System.out.println("Esta orientado el pulso?");
                                System.out.println("1.Si");
                                System.out.println("2.No");
                                a = scan.nextInt();
                                if (a == 1) {
                                    System.out.println("Prioridad 2 (amarillo)");
                                    amarillo++;
                                } else if (a == 2) {
                                    System.out.println("Prioridad 1 (rojo)");
                                    rojo++;
                                } else {
                                    System.out.println("Opcion incorrecta");
                                }
                            } else if (a == 2) {
                                System.out.println("Controle la hemorragia");
                                System.out.println("Prioridad 1 (rojo)");
                                rojo++;
                            } else {
                                System.out.println("Opcion incorrecta");
                            }
                        } else {
                            System.out.println("Opcion incorrecta");
                        }
                    } else if (a == 2) {
                        System.out.println("Haciendo maniobras de reposicion respira?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        a = scan.nextInt();
                        if (a == 1) {
                            System.out.println("Prioridad 1 (rojo)");
                            rojo++;
                        } else if (a == 2) {
                            System.out.println("Prioridad 0 (negro)");
                            negro++;
                        } else {
                            System.out.println("Opcion incorrecta");
                        }
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                } else {
                    System.out.println("Opcion incorrecta");
                }
            } else if (opt == 2) {
                System.out.println("Negro: " + negro);
                System.out.println("Rojo: " + rojo);
                System.out.println("Amarillo: " + amarillo);
                System.out.println("Verde: " + verde);

            } else {
                break;
            }
        }
    }
}
