package com.politecnicomalaga.protocolomedico;

import java.util.Scanner;

public class ProtocoloMedico {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Ecografia transtoracica");
            System.out.println("Complicado?");
            System.out.println("1.Si");
            System.out.println("2.No");
            int a = scan.nextInt();
            if (a == 1) {
                System.out.println("Drenaje pleural");
                System.out.println("+fibrinoliticos");
                System.out.println("+antibioterapia");
                System.out.println("Mala evolucion en 48-72h?");
                System.out.println("1.Si");
                System.out.println("2.No");
                a = scan.nextInt();
                if (a == 1) {
                    System.out.println("Ecografia");
                    System.out.println("Persistencia de derrame y septos?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    a = scan.nextInt();
                    if (a == 1) {
                        System.out.println("Videotoracoscopia");
                        break;
                    } else if (a == 2) {
                        System.out.println("Continuar tratamiento");
                        break;
                    }
                } else if (a == 2) {
                    System.out.println("Continuar tratamiento");
                    break;
                }
            } else if (a == 2) {
                System.out.println("Dificultad respiratoria?");
                System.out.println("1.Si");
                System.out.println("2.No");
                a = scan.nextInt();
                if (a == 1) {
                    System.out.println("Drenaje pleural + Antibioterapia");
                    System.out.println("Empeoramiento en siguientes 24-48?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    a = scan.nextInt();
                    if (a == 2) {
                        System.out.println("Continuar tratamiento");
                        break;
                    }
                } else if (a == 2) {
                    System.out.println(">10 mm?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    a = scan.nextInt();
                    if (a == 1) {
                        System.out.println("Toracocentesis diagnostica");
                        System.out.println("Pus o pH <7.2?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        a = scan.nextInt();
                        if (a == 1) {
                            System.out.println("Drenaje pleural + Antibioterapia");
                            System.out.println("Empeoramiento en siguientes 24-48h?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            a = scan.nextInt();
                            if (a == 2) {
                                System.out.println("Continuar tratamiento");
                                break;
                            }
                        } else if (a == 2) {
                            System.out.println("Tratamiento conservador: Antibioterapia");
                            System.out.println("Empeoramiento en siguientes 24-48?");
                            System.out.println("1.Si");
                            System.out.println("2.No");
                            a = scan.nextInt();
                            if (a == 2) {
                                System.out.println("Continuar tratamiento");
                                break;
                            }
                        }
                    } else if (a == 2) {
                        System.out.println("Tratamiento conservador: Antibioterapia");
                        System.out.println("Empeoramiento en siguientes 24-48?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        a = scan.nextInt();
                        if (a == 2) {
                            System.out.println("Continuar tratamiento");
                            break;
                        }

                    }
                }
            }
        }
    }
}
