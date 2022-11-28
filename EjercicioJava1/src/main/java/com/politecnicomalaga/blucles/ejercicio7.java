package com.politecnicomalaga.blucles;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        CajaFuerte cajita = new CajaFuerte();
        int option;
        int i = 0;
        Scanner scan = new Scanner(System.in);

        while (i == 0) {
            System.out.println("1. Asignar nueva combinacion: ");
            System.out.println("2. Abrir caja fuerte: ");
            System.out.println("0. Salir");
            option = scan.nextInt();
            if (option == 1){
                cajita.changeKey();
            } else if (option == 2){
                cajita.open();
            }else{
                break;
            }
        }
    }
}
