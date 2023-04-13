package com.politecnicomalaga.ejercicioevaluacion;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int N = scan.nextInt();
        
        
        for(int i=N;i>0;i--){
            System.out.println(N+1-i);
        }
        for(int i=0;i<N;i++){
            System.out.println(N-i);
        }
    }
}
