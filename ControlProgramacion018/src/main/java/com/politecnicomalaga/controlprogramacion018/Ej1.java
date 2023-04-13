package com.politecnicomalaga.controlprogramacion018;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        var a = 0;
        var b = 0;
        int vector[] = {3, 5, 2, 8, 9, 7};
        
        
        while (true) {
            System.out.print("Introduce las posiciones de la array (la primera posicion tiene que ser menor que la segunda, menor de la longitud del vector y positivo): ");
            a = scan.nextInt();
            b = scan.nextInt();
            if (a < b && a <= vector.length && a >= 0 && b <= vector.length && b >= 0) {
                break;
            }
        }
        
        
        vectorRes =SubArray(vector, a, b);
        int vectorRes[];
        for(int i = 0; i<vectorRes.length;i++){
            System.out.println(vectorRes[i]+" ");
        }

    }

    public static int[] SubArray(int vector[], int a, int b) {
        int resultado[];
        int count = 0;
        for (int i = a - 1; i < b; i++) {
            resultado[count] = i;
            count++;            
        }
        
        return resultado;
        
    }

}
