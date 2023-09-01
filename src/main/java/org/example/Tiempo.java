package org.example;
import javax.swing.JOptionPane;
public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return this.hora + "h" + this.minutos + "m" + this.segundos + "s";
    }

    public static Tiempo SumaDeTiempo (Tiempo tiempo1, tiempo2)
}