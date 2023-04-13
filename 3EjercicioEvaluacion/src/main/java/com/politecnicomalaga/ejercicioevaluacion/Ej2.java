package com.politecnicomalaga.ejercicioevaluacion;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
        int pos = -1;
        int vel = -1;
        int acel = 0;
        int tiempo = 0;

        Scanner scan = new Scanner(System.in);

        while (pos < 0) {
            System.out.println("Introduce la posicion inicial: ");
            pos = scan.nextInt();
            if (pos < 0) {
                System.out.println("Dato incorrecto. (Tiene que ser mayor o igual que cero)");
            }
        }
        while (vel < 0 || vel > 100) {
            System.out.println("Introduce la velocidad inicial");
            vel = scan.nextInt();
            if (vel < 0 || vel > 100) {
                System.out.println("Dato incorrecto. (Tiene que estar entre 0 y 100)");
            }
        }
        while (acel <5 || acel > 15){
            System.out.println("Introduce la aceleracion inicial");
            acel = scan.nextInt();
            if (acel <5 || acel >15) {
                System.out.println("Dato incorrecto. (Tiene que estar entre 5 y 15)");
            }
        }
        while (tiempo <10 || tiempo > 100){
            System.out.println("Introduce el tiempo");
            tiempo = scan.nextInt();
            if (tiempo <10 || tiempo >100) {
                System.out.println("Dato incorrecto. (Tiene que estar entre 10 y 100)");
            }
        }
        
        for(int i=0;i<tiempo; i++){
            pos = pos + vel;
            vel = vel + acel;
        }
        
        System.out.println("- Velocidad: "+vel+" m/s");
        System.out.println("- Aceleracion: "+acel+" m/s2");
        System.out.println("- Posicion: "+pos+" m");
        System.out.println("- Tiempo usado: "+tiempo+" segundos");
        
    }
}
