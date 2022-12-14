
package com.politecnicomalaga.vacacionesenlacostadelsolhotel;

import java.util.Scanner;

public class Cliente {
    
    Scanner scan = new Scanner(System.in);
    String DNI, nombre, apellidos, direccion, email, telefono;
    String edad, nacimiento;
    
    
//constructor
    public Cliente(String DNI, String nombre, String apellidos, String direccion, String email, String telefono, String edad, String nacimiento){
        System.out.println("Introduce tu DNI");
        this.DNI = scan.nextLine();
        System.out.println("Introduce tu nombre");
        this.nombre = scan.nextLine();
        System.out.println("Introduce tus apellidos");
        this.apellidos = scan.nextLine();
        System.out.println("Introduce tu direccion");
        this.direccion = scan.nextLine();
        System.out.println("Introduce tu email");
        this.email = scan.nextLine();
        System.out.println("Introduce tu telefono");
        this.telefono = scan.nextLine();
        System.out.println("Introduce edad");
        this.edad = scan.nextLine();
        System.out.println("Introduce tu nacimiento");
        this.nacimiento = scan.nextLine();        
    }
    
//getters
    public String getDNI(){
        return DNI;
    }    
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEdad(){
        return edad;
    }
    public String getNacimiento(){
        return nacimiento;
    }

    
    public String toString(){
        String mensaje="DNI: "+DNI+", Nombre: "+nombre+", Apellidos: "+apellidos+", Direccion: "+direccion+", Email: "+email+", Telefono: "+telefono+", edad";
        return mensaje;
    }

    
    
    
    
}
