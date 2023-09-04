package org.example;

public class Cliente extends Empleado{
    private int NumeroAfiliacion;
    private String Nombre;
    private int edad;
    private String direccion;
    private String RFC;

    public int getNumeroAfiliacion() {
        return NumeroAfiliacion;
    }

    public void setNumeroAfiliacion(int numeroAfiliacion) {
        NumeroAfiliacion = numeroAfiliacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}
