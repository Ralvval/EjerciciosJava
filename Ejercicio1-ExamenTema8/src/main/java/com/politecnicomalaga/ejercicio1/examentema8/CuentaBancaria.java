package com.politecnicomalaga.ejercicio1.examentema8;

import java.util.ArrayList;

/**
 *
 * @author xxrax
 */
public class CuentaBancaria {

    String dni, nombre, email, tlf, iban;
    float saldo;
    String tipo;
    ArrayList<Operacion> operaciones = new ArrayList();

    public CuentaBancaria(String dni, String nombre, String email, String tlf, String iban, String tipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.tlf = tlf;
        this.iban = iban;
        this.saldo = 0;
        this.tipo = tipo;

    }

    public void crearOperacion(int fecha, String hora, String ibanOrigen, String ibanDestino, int cantidadOperada) {
        Operacion operacion = new Operacion(fecha, hora, ibanOrigen, ibanDestino, cantidadOperada);
        operaciones.add(operacion);

    }

    public void consultarOperacion(Operacion operacion) {
        operaciones.get(operaciones.indexOf(operacion));
    }

    public ArrayList<Operacion> listarOperaciones(int fechaI, int fechaF) {
        ArrayList<Operacion> ops = new ArrayList();
        for (Operacion op : operaciones) {
            if (operaciones.get(operaciones.indexOf(op)).getFecha() >= fechaI && operaciones.get(operaciones.indexOf(op)).getFecha() <= fechaF) {
                operaciones.add(op);
            }
        }
        return ops;
    }

    public String getIban() {
        return iban;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }
    public void ingresar(int cantidad){
        this.saldo += cantidad;
    }
    public void retirar(int cantidad){
        this.saldo -= cantidad;
    }
    

}
