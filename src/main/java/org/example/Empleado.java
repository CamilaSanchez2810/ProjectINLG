package org.example;

public class Empleado extends Cliente{

    private int NumeroEmpleado;
    private Double salario;
    private String horario;

    public int getNumeroEmpleado() {
        return NumeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        NumeroEmpleado = numeroEmpleado;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}