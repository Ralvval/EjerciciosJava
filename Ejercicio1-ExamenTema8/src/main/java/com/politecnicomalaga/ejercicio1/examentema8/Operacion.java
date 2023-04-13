
package com.politecnicomalaga.ejercicio1.examentema8;

/**
 *
 * @author xxrax
 */
public class Operacion {

    String hora, ibanOrigen, ibanDestino;
    int cantidadOperada;
    int fecha;

    public Operacion(int fecha, String hora, String ibanOrigen, String ibanDestino, int cantidadOperada) {
        this.fecha = fecha;
        this.hora = hora;
        this.ibanOrigen = ibanOrigen;
        this.ibanDestino = ibanDestino;
        this.cantidadOperada = cantidadOperada;
    }

    public int getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getIbanOrigen() {
        return ibanOrigen;
    }

    public String getIbanDestino() {
        return ibanDestino;
    }

    public int getCantidadOperada() {
        return cantidadOperada;
    }
    
    
    
    
    
    
    
    
    
    
}
