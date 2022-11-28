
package com.politecnicomalaga.If;

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el numero de horas trabajadas");
        int i=0;
        int horas = scan.nextInt();
        int salario = 0;
        
        for(i=1;i<=horas;i++){
            if(i<=40){
                salario = salario + 15;
            }
            else{
                salario = salario +20;
            }
        }
        System.out.println("El salario semanal es: "+ salario);
        
    
    }
}