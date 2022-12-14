package com.politecnicomalaga.vacacionesenlacostadelsolhotel;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Cliente Cliente = new Cliente("DNI", "nombre", "apellidos", "direccion", "email", "telefono", "edad", "nacimiento");
        ArrayList<Cliente> Clientes = new ArrayList<Cliente>();

        Clientes.add(Cliente);
        System.out.println(Cliente);

    }
}
