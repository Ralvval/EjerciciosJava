
package com.politecnicomalaga.ejercicioevaluacion;

import java.util.Scanner;

public class Producto {
    
    String descripcion;
    int codigo;
    float precio;
    Scanner scan = new Scanner(System.in);
    public Producto(){
        System.out.println("Introduce una descripcion: ");
        this.descripcion = scan.nextLine();
        System.out.println("Introduce un codigo: ");
        this.codigo = scan.nextInt();
        System.out.println("Introduce un precio: ");
        this.precio = scan.nextFloat();
    }
    
    public float getPrecio(){
        return precio;
    }
    public void aumentarPrecio(int porcentaje){
        precio= precio + precio * porcentaje/100;
    }
    public void rebajarPrecio(int porcentaje){
        precio= precio - precio * porcentaje/100;
    }
    public void mostrarProducto(){
        System.out.println("Descripcion: "+descripcion+", Codigo: "+codigo+ ", Precio: "+precio);    }
}
