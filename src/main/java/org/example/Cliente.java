package org.example;

public class Cliente extends Datos{
    private int NumeroAfiliacion;
    private String RFC;

    public int getNumeroAfiliacion() {
        return NumeroAfiliacion;
    }
    public void setNumeroAfiliacion(int numeroAfiliacion) {
        NumeroAfiliacion = numeroAfiliacion;
    }
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}