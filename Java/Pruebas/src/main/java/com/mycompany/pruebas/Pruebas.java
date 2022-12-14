package com.mycompany.pruebas;






public class Pruebas {

    public static void main(String[] args) {
        String nombre = null;
        String raza = null;
        String genero = null;
        String clase = null;
        Personaje p1 = new Personaje(nombre, raza, genero, clase);
        
        System.out.println("Empezemos con la creacion de personaje");
        System.out.println("");
        p1.setNombre();
        System.out.println("");
        p1.setRaza();
        System.out.println("");
        p1.setGenero();
        System.out.println("");
        p1.setClase();
        
        System.out.println(p1.toString());
        
        
        
    }
}
