package com.politecnicomalaga.blucles;

import java.util.Scanner;

public class CajaFuerte {

    Scanner scan = new Scanner(System.in);
    String key;

    public CajaFuerte() {
        this.key = "0000";
    }

    public String getKey() {
        return key;
    }

    public void changeKey() {
        System.out.println("Ingresa la clave de la caja fuerte");

        String oldKey = scan.nextLine();
        if (oldKey.length() == 4) {
            if (oldKey.equals(key)) {
                System.out.println("Ingresa la nueva clave");
                key = scan.nextLine();
                System.out.println("Clave actualizada");
            } else {
                System.out.println("Clave incorrecta");
            }
        }else{
            System.out.println("La clave tiene que ser de 4 digitos");
        }
    }

    public void open() {
        System.out.println("Ingresa la clave de la caja fuerte");
        String oldKey = scan.nextLine();
        if (oldKey.equals(key)) {
            System.out.println("Caja fuerte abierta");
        } else {
            System.out.println("Clave incorrecta");
        }
    }

}
