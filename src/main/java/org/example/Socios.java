package org.example;
public class Socios {
    private int NumeroIdentificacion;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String FechaDeAlta;

    public int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        NumeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getFechaDeAlta() {
        return FechaDeAlta;
    }

    public void setFechaDeAlta(String fechaDeAlta) {
        FechaDeAlta = fechaDeAlta;
    }
    protected void RealizarPrestamo(){

    }
}
