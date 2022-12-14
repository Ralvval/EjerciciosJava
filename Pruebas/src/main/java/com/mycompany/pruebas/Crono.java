package com.mycompany.pruebas;

import java.awt.event.KeyEvent;
import static java.lang.Thread.sleep;

public class Crono {

    boolean estado;
    int segundos = 0;
    int minutos = 0;
    int horas = 0;

    public void adelante() throws InterruptedException {

        while (true) {

            sleep(1000);
            segundos++;
            if (segundos >= 59) {
                minutos++;
                segundos = 0;
            }
            if (minutos >= 59) {
                horas++;
                minutos = 0;
            }
            if (horas > 23) {
                horas = 0;
            }
            System.out.println(String.format("%02d", horas) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d", segundos));

        }
    }

    public void atras(int horas, int minutos, int segundos) throws InterruptedException {

        while (true) {
            this.segundos = segundos;
            this.minutos = minutos;
            this.horas = horas;
            sleep(1000);
            segundos--;
            if (segundos <= 0) {
                minutos--;
                segundos = 59;
            }
            if (minutos <= 0) {
                horas--;
                minutos = 59;
            }
            if (horas <= 0) {
                horas = 23;
            }
            if (horas <= 23 && minutos <= 59 && segundos <= 59) {
                System.out.println(String.format("%02d", horas) + ":" + String.format("%02d", minutos) + ":" + String.format("%02d", segundos));
            } else {
                System.out.println("Datos incorrectos, recuerda que horas no puede ser mayor a 23 y minutos y segundos mayor a 59");
                break;
            }
            

        }
    }

    public void detener(java.awt.event.KeyEvent evt) throws InterruptedException {
        estado = false;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("a");
            wait();
            estado = true;
        }
    }
    public boolean resumen(java.awt.event.KeyEvent evt){
    if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        notify();
        return estado = false;
    }
    return estado = true;
}
}
