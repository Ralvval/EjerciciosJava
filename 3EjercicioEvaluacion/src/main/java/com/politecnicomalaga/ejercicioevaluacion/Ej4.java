package com.politecnicomalaga.ejercicioevaluacion;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Producto producto1 = null;
        Producto producto2 = null;
        int porcentaje;

        while (true) {
            System.out.println("1.Crear producto 1");
            System.out.println("2.Crear producto 2");
            System.out.println("3.Aumentar precio producto 1");
            System.out.println("4.Aumentar precio producto 2");
            System.out.println("5.Rebajar precio producto 1");
            System.out.println("6.Rebajar precio producto 2");
            System.out.println("7.Mostrar datos de los productos");
            System.out.println("8.Salir");
            int a = scan.nextInt();
            if (a == 1) {
                producto1 = new Producto();
            } else if (a == 2) {
                producto2 = new Producto();
            } else if (a == 3) {
                System.out.println("Introduce un % para el descuento");
                porcentaje = scan.nextInt();
                producto1.aumentarPrecio(porcentaje);
            } else if (a == 4) {
                System.out.println("Introduce un % para el descuento");
                porcentaje = scan.nextInt();
                producto2.aumentarPrecio(porcentaje);
            }else if (a==5){
                System.out.println("Introduce un % para el descuento");
                porcentaje = scan.nextInt();
                producto1.rebajarPrecio(porcentaje);
            }else if(a==6){
                System.out.println("Introduce un % para el descuento");
                porcentaje = scan.nextInt();
                producto2.rebajarPrecio(porcentaje);
            }else if(a==7){
                producto1.mostrarProducto();
                producto2.mostrarProducto();
            }else if(a==8){
                break;
            }else{
                System.out.println("No hay ninguna opcion con este valor");
            }

        }
    }
}
