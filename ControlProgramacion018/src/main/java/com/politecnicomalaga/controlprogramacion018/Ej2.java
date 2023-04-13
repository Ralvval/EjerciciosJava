package com.politecnicomalaga.controlprogramacion018;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean piloto0, piloto1, piloto2, piloto3, piloto4, piloto5;
        int p[] = {0,0,0,0,0,0};

        String pilotos[] = new String[6];
        int tabla[][];
        tabla = new int[6][3];
        for (int i = 0; i < 6; i++) {
            int a = i + 1;
            System.out.println("Introduce el piloto " + a);
            String piloto = scan.nextLine();
            pilotos[i] = piloto;
        }
        for (int t = 0; t < 3; t++) {
            piloto0 = false;
            piloto1 = false;
            piloto2 = false;
            piloto3 = false;
            piloto4 = false;
            piloto5 = false;
            int i = 0;

            for (i = 0; i < 3; i++) {
            
                int numero = (int) (Math.random() * 5 + 0);

                if (i == 0) {
                    if (numero == 0) {
                        p[0] = p[0] + 10;
                        tabla[numero][t] = p[0];
                        piloto0 = true;
                    } else if (numero == 1) {
                        p[1] = p[1] + 10;
                        tabla[numero][t] = p[1];
                        piloto1 = true;
                    } else if (numero == 2) {
                        p[2] = p[2] + 10;
                        tabla[numero][t] = p[2];
                        piloto2 = true;
                    } else if (numero == 3) {
                        p[3] = p[3] + 10;
                        tabla[numero][t] = p[3];
                        piloto3 = true;
                    } else if (numero == 4) {
                        p[4] = p[4] + 10;
                        tabla[numero][t] = p[4];
                        piloto4 = true;
                    } else if (numero == 5) {
                        p[5] = p[5] + 10;
                        tabla[numero][t] = p[5];
                        piloto5 = true;
                    }
                }
                if (i == 1) {
                    if (numero == 0 && piloto0 != true) {
                        p[0] = p[0] + 8;
                        tabla[numero][t] = p[0];
                        piloto0 = true;
                    } else if (numero == 1 && piloto1 != true) {
                        p[1] = p[1] + 8;
                        tabla[numero][t] = p[1];
                        piloto1 = true;
                    } else if (numero == 2 && piloto2 != true) {
                        p[2] = p[2] + 8;
                        tabla[numero][t] = p[2];
                        piloto2 = true;
                    } else if (numero == 3 && piloto3 != true) {
                        p[3] = p[3] + 8;
                        tabla[numero][t] = p[3];
                        piloto3 = true;
                    } else if (numero == 4 && piloto4 != true) {
                        p[4] = p[4] + 8;
                        tabla[numero][t] = p[4];
                        piloto4 = true;
                    } else if (numero == 5 && piloto5 != true) {
                        p[5] = p[5] + 8;
                        tabla[numero][t] = p[5];
                        piloto5 = true;
                    }
                }
                if (i == 2) {
                    if (numero == 0 && piloto0 != true) {
                        p[0] = p[0] + 6;
                        tabla[numero][t] = p[0];
                    } else if (numero == 1 && piloto1 != true) {
                        p[1] = p[1] + 6;
                        tabla[numero][t] = p[1];
                    } else if (numero == 2 && piloto2 != true) {
                        p[2] = p[2] + 6;
                        tabla[numero][t] = p[2];
                    } else if (numero == 3 && piloto3 != true) {
                        p[3] = p[3] + 6;
                        tabla[numero][t] = p[3];
                    } else if (numero == 4 && piloto4 != true) {
                        p[4] = p[4] + 6;
                        tabla[numero][t] = p[4];
                    } else if (numero == 5 && piloto5 != true) {
                        p[5] = p[5] + 6;
                        tabla[numero][t] = p[5];
                    }
                }

            }
        }

        for (int i = 0; i < 6; i++) {
            
            System.out.println("Piloto: " + pilotos[i] + p[i]);
            
        }

    }
}
