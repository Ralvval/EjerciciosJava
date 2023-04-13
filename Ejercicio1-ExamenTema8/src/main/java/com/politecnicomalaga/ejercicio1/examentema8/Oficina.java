package com.politecnicomalaga.ejercicio1.examentema8;

import java.util.ArrayList;

/**
 *
 * @author xxrax
 */
public class Oficina {

    String direccion, codOfi, tlf, email, cp, ciudad;
    ArrayList<CuentaBancaria> cuentas = new ArrayList();
    boolean encontrada = false;
    

    public Oficina() {
    }

    public Oficina(String direccion, String codOfi, String tlf, String email, String cp, String ciudad) {
        this.direccion = direccion;
        this.codOfi = codOfi;
        this.tlf = tlf;
        this.email = email;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public void darAlta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public ArrayList listarCuentas() {
        return cuentas;
    }

    public CuentaBancaria buscarCuenta(String iban) {
        int a = -1;
        for (CuentaBancaria cuenta : cuentas) {

            if (cuenta.getIban() == iban) {

                a = cuentas.indexOf(cuenta);
            }

        }
        if (a!=-1){
            encontrada = true;
        }

        return cuentas.get(a);
    }
    public void cerrarCuenta(CuentaBancaria cuenta){
        if(cuenta.getSaldo()>=0){
            cuentas.remove(cuenta);
        }else{
            System.out.println("El saldo tiene que ser positivo");
        }
        
    }
    
    public void cobrarHipoteca(CuentaBancaria cuenta){
        if(cuenta.getTipo()=="ahorro"){
            cuenta.setSaldo((int)(cuenta.getSaldo()*0.01));
        }else if(cuenta.getTipo()=="hipoteca"){
            cuenta.setSaldo((int)(cuenta.getSaldo()*0.01));
        }else if(cuenta.getTipo()=="deposito"){
            cuenta.setSaldo((int)(cuenta.getSaldo()*0.04));
        }
        
    }

    public boolean isEncontrada() {
        return encontrada;
    }
    

    public void setEncontrada(boolean encontrada) {
        this.encontrada = encontrada;
    }

}
