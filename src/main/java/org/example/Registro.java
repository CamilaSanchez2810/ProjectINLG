package org.example;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Registro{
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Empleado>listaEmpleado = new ArrayList<>();
    private List<Manager> listaManager = new ArrayList<>();

    public List<Manager> getListaManager() {
        return listaManager;
    }

    public void setListaManager(List<Manager> listaManager) {
        this.listaManager = listaManager;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    public void setlistaClientes(Cliente registroCliente){
        this.listaClientes.add(registroCliente);
    }
    public void setlistaEmpleados(Empleado registroEmpleado){
        this.listaClientes.add(registroEmpleado);
    }
    public void setlistaManager(Manager registroManager){
        this.listaManager.add(registroManager);
    }

    public List<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(List<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public void setlistaEmpleado(Empleado registroEmpleado){
        this.listaEmpleado.add(registroEmpleado);
    }

    public void deleteRegistrodeClientes(int numeroafiliacion){
        Cliente registroCliente1 = null;
        for (Cliente registrodelcliente: listaClientes) {
            if (registrodelcliente.getNumeroAfiliacion() == numeroafiliacion) {
                registroCliente1 = registrodelcliente;
            }
        }
        if (registroCliente1 != null){
            listaClientes.remove(listaClientes.indexOf(registroCliente1));
            JOptionPane.showMessageDialog(null,"El registro ha sido eliminado");
        }
        else {
            JOptionPane.showMessageDialog(null,"No se encontro el registro");
        }
    }

    public void deleteRegistroEmpleado(int NumeroEmpleado){
        Empleado registroEmpleado1 = null;
        for (Empleado registrodeEmpleado: listaEmpleado) {
            if (registrodeEmpleado.getNumeroEmpleado()== NumeroEmpleado){
                registroEmpleado1 = registrodeEmpleado;
            }
        }
        if(registroEmpleado1 != null){
            listaEmpleado.remove(listaEmpleado.indexOf(registroEmpleado1));
            JOptionPane.showMessageDialog(null,"El registro del empleado ha sido eliminado");
        }
        else {
            JOptionPane.showMessageDialog(null,"No se encontro el registro");
        }
    }

    public Cliente mostarRegistroCliente(int numerodeAfiliacion){
        Cliente registrocliente = null;
        for (Cliente registrodelCliente1:listaClientes) {
            if(registrocliente.getNumeroAfiliacion()==numerodeAfiliacion){
                registrocliente = registrodelCliente1;
            }
            if(registrocliente != null){
                JOptionPane.showMessageDialog(null,"El numero de afileacion del cliente es: "+ registrocliente.getNumeroAfiliacion());
                JOptionPane.showMessageDialog(null,"El nombre del Cliente es: " + registrocliente.getNombre());
                JOptionPane.showMessageDialog(null,"La edad del cliente es: " + registrocliente.getEdad());
                JOptionPane.showMessageDialog(null,"La direccion del cliente es: " + registrocliente.getDireccion());
                JOptionPane.showMessageDialog(null,"El RFC del cliente es: " + registrocliente.getRFC());
            }
        }
        return registrocliente;
    }

    public Empleado mostrarRegistroEmpleado(int numerodeEmpleado){
        Empleado registroEmpleado = null;
        for (Empleado registroEmpleado1:listaEmpleado) {
            if(registroEmpleado.getNumeroEmpleado() == numerodeEmpleado){
                registroEmpleado = registroEmpleado1;
            }
            if(registroEmpleado != null) {
                JOptionPane.showMessageDialog(null, "El numero del empleado es: " + registroEmpleado.getNumeroEmpleado());
                JOptionPane.showMessageDialog(null, "El nombre del empleado es: " + registroEmpleado.getNombre());
                JOptionPane.showMessageDialog(null, "La edad del empleado es: " + registroEmpleado.getEdad());
                JOptionPane.showMessageDialog(null, "La direccion del empleado es: " + registroEmpleado.getDireccion());
                JOptionPane.showMessageDialog(null, "El salario del empleado es: " + registroEmpleado.getSalario());
                JOptionPane.showMessageDialog(null, "El horario del empleado es: " + registroEmpleado.getHorario());
            }
        }
        return registroEmpleado;
    }
}