package org.example;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main extends Tiempo {

    {
        List<Cliente> listaClientes = new ArrayList<>();
        JOptionPane.showMessageDialog(null,"Bienvenido a el registro");
        int op = Integer.parseInt(JOptionPane.showInputDialog("¿que desea realizar? \n " +
                "1-Agregar clientes \n"+
                "2-Agregar un Empleado \n"+
                "3-agregar un manager\n"+
                "4-Elimar cliente\n"+
                "5-Eliminar empleado\n"+
                "6-Mostrar Clientes\n"+
                "7-Mostrar Empleados"));
        switch (op){
            case 1:
                Cliente cliente1 = new Cliente();
                JOptionPane.showMessageDialog(null,"ingrese los datos del cliente: ");
                cliente1.setNumeroAfiliacion(Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de afilacion: ")));
                cliente1.setNombre(JOptionPane.showInputDialog("ingresa el nombre: "));
                cliente1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad: ")));
                cliente1.setDireccion(JOptionPane.showInputDialog("ingresa la direccion: "));
                cliente1.setRFC(JOptionPane.showInputDialog("ingresa el RFC: "));
                listaClientes.add(cliente1);
                break;

            case 2:
                Empleado empleado1 = new Empleado();
                JOptionPane.showMessageDialog(null,"ingresa los datos del emplado: ");
                empleado1.setNumeroEmpleado(Integer.parseInt(JOptionPane.showInputDialog("ingresa el ")));
                empleado1.setNombre(JOptionPane.showInputDialog("ingresa el nombre del empleado: "));
                empleado1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingresa tu edad: ")));
                empleado1.setDireccion(JOptionPane.showInputDialog("ingresa la direccion: "));
        }
    }
}
