package com.mycompany.pruebas;

import java.util.Scanner;

public class Personaje {

    Scanner scan = new Scanner(System.in);
    String nombre, raza, genero, clase;
    int nivel, ataque, ataqueMagico, defensa, iRaza, iGenero, iClase;
    double exp, maxExp;
    
    public Personaje(String nombre, String raza, String genero, String clase) {
        this.nombre = nombre;
        this.raza = raza;
        this.genero = genero;
        this.clase = clase;
        nivel = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getGenero() {
        return genero;
    }

    public String getClase() {
        return clase;
    }
    public int getNivel(){
        return nivel;
    }

    public void setNombre() {
        System.out.println("Introduce el nombre del personaje");
        nombre = scan.nextLine();
        System.out.println("El nombre de tu personaje es: " + nombre);
    }

    public void setRaza() {
        while (iRaza < 1 || iRaza > 4) {
            System.out.println("Elige tu raza: ");
            System.out.println("1.Humano");
            System.out.println("2.Elfo");
            System.out.println("3.Orco");
            System.out.println("4.Enano");

            iRaza = scan.nextInt();

            if (iRaza == 1) {
                raza = "Humano";
            } else if (iRaza == 2) {
                raza = "Elfo";
            } else if (iRaza == 3) {
                raza = "Orco";
            } else if (iRaza == 4) {
                raza = "Enano";
            } else {
                System.out.println("Opcion no disponible, Seleccione una opcion de las siguientes");
            }
        }

    }
    public void setGenero(){
        while (iGenero < 1 || iGenero > 4){
            System.out.println("Elige tu genero: ");
            System.out.println("1.Hombre");
            System.out.println("2.Mujer");
            System.out.println("3.Bolsa del mercadona");
            System.out.println("4.Otro...");
            iGenero = scan.nextInt();

            if (iGenero == 1) {
                genero = "Hombre";
            } else if (iGenero == 2) {
                genero = "Mujer";
            } else if (iGenero == 3) {
                genero = "una bolsa del mercadona";
            } else if (iGenero == 4) {
                genero = "tontito";
            } else {
                System.out.println("Opcion no disponible, Seleccione una opcion de las siguientes");
            }
        }
    }
    public void setClase() {
        while (iClase < 1 || iClase > 4) {
            System.out.println("Elige tu raza: ");
            System.out.println("1.Guerrero");
            System.out.println("2.Cazador");
            System.out.println("3.Picaro");
            System.out.println("4.Mago");

            iClase = scan.nextInt();

            if (iClase == 1) {
                clase = "guerrero";
                ataque = nivel * 15;
                ataqueMagico = nivel * 2;
                defensa = nivel * 15;
            } else if (iClase == 2) {
                clase = "cazador";
                ataque = nivel * 20;
                ataqueMagico = nivel * 10;
                defensa = nivel * 5;
            } else if (iClase == 3) {
                clase = "picaro";
                ataque = nivel * 20;
                ataqueMagico = nivel * 5;
                defensa = nivel * 5;
            } else if (iClase == 4) {
                clase = "mago";
                ataque = nivel * 2;
                ataqueMagico = nivel * 25;
                defensa = nivel * 2;
            } else {
                System.out.println("Opcion no disponible, Seleccione una opcion de las siguientes");
            }
        }
    }
        
        public void setNivel(){
            if (exp >= maxExp){
                exp = 0;
                maxExp = maxExp * 1.45;
                nivel = nivel + 1;
            }
                 
        }
    
    public String toString (){
        String mensaje="El personaje se llama "+nombre+" de la raza "+raza+" el es " +genero+ " y su clase es "+clase;
        return mensaje;
    }
    
    
    
}
        


