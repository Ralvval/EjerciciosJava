
package com.politecnicomalaga.codificadorcesar;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class CodificadorCesar {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el mensaje que quieras encriptar");
        String frase = scan.nextLine();
        byte[] codigoAscii = frase.getBytes("US-ASCII");
        for (int i = 0; i < codigoAscii.length; i++) {
            codigoAscii[i] += 2; // sumar 2 a cada elemento
}
               
        String fraseCodificada = new String(codigoAscii, "US-ASCII"); 
        System.out.println(fraseCodificada);
    }
    
}
