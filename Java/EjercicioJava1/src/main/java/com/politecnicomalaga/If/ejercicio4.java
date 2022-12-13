
package com.politecnicomalaga.If;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce 3 notas para hacer la media: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        
        double media = (a + b + c)/3;
        
        if(media<5){
            System.out.println(media+ " (Insuficiente)");
        }
        else if(media<6){
            System.out.println(media+ " (Suficiente)");
        }
        else if(media<7){
            System.out.println(media+ " (Bien)");
        }
        else if(media<8.5){
            System.out.println(media+ " (Notable)");
        }
        else if(media>=8.5){
            System.out.println(media+ " (Sobresaliente)");
        }
        else{
            System.out.println("no valido, vuelve a intentar");
        }
    }
    
}
