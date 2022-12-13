
package com.politecnicomalaga.ejerciciosBasicosJava;

import java.util.Scanner;

public class ejercicio6 {
    
    public static void main(String[] args) {
        
        var iva = 1.21;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce la base imponible de su factura");
        var factura = scan.nextDouble();
        
        System.out.println("El total de su factura es: "+ factura * iva);
    }
   
    
}
