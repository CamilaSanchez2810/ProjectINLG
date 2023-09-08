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
    public int SumaHora(Tiempo tiempo1,Tiempo tiempo2){
        int sumahoras = tiempo1.hora + tiempo2.hora;
        return sumahoras;
    }
    public int Sumaminutos (Tiempo tiempo1, Tiempo tiempo2){
        int SumaMinutos = tiempo1.minutos+tiempo2.minutos;
        if (SumaMinutos == 60){
            int totalminutos = SumaMinutos % 60;
            return totalminutos;
        }
        return SumaMinutos;
    }
    public int SumaSegundos(Tiempo tiempo1, Tiempo tiempo2){
        int sumasegundos = tiempo1.segundos + tiempo2.segundos;
        if(sumasegundos == 60){
            int sumadesegundos= sumasegundos%60;
            return sumadesegundos;
        }
        return sumasegundos;
    }

}