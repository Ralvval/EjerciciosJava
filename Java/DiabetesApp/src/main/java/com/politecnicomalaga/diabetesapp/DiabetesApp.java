package com.politecnicomalaga.diabetesapp;

import java.util.Scanner;

public class DiabetesApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;

        while (a == 0) {
            System.out.println("Comprueba la glucemia");
            System.out.println("Inserte el numero: ");
            int glucemia = scan.nextInt();
            if (glucemia >= 70 && glucemia <= 110) {
                System.out.println("Niveles normales");
                break;
            } else if (glucemia > 110 && glucemia < 180) {
                System.out.println("Niveles de azucar altos pero no tiene que ver con la diabetes");
                break;
            } else if (glucemia >= 180) {
                System.out.println("Administra agua y avisa a su familia");
                break;
            } else if (glucemia < 70) {
                System.out.println("Esta consciente?: ");
                System.out.println("1.Si");
                System.out.println("2.No");
                int i = scan.nextInt();
                if (i == 1) {
                    System.out.println("Dar liquidos azucarados de absorcion basica (zumos, azucar...)");
                    System.out.println("Repetir glucemia 5-10 min despues");
                    System.out.println("Dar hidratos de carbono de absorcion lenta (galletas, bocadillo...)");
                    System.out.println("");
                    System.out.println("Se ha solucionado el problema?");
                    System.out.println("1.Si");
                    System.out.println("No (vale cualquier numero excepto el 0)");
                    i = scan.nextInt();
                    if (i == 1) {
                        break;
                    }
                } else if (i == 2) {
                    System.out.println("NO DAR NADA POR LA BOCA");
                    System.out.println("Administrar glucagon, avisar a la familia y a Emergencias");
                    break;
                } else {
                    System.out.println("Valor incorrecto vuelvalo a intentar con 1 o 2");
                }

            }

        }
    }
}
