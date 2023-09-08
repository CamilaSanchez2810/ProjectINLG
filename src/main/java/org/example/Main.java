package org.example;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main extends Tiempo {
    public static void main(String[] args) {
       {
            String opcion;
            List<Cliente> listaClientes = new ArrayList<>();
            Registro registro = new Registro();
            JOptionPane.showMessageDialog(null, "Bienvenido a el registro");
            do {
                int op = Integer.parseInt(JOptionPane.showInputDialog("¿que desea realizar? \n " +
                        "1-Agregar clientes \n" +
                        "2-Agregar un Empleado \n" +
                        "3-agregar un manager\n" +
                        "4-Elimar cliente\n" +
                        "5-Eliminar empleado\n" +
                        "6-Mostrar Clientes\n" +
                        "7-Mostrar Empleados"));
                switch (op) {
                    case 1:
                        Cliente cliente1 = new Cliente();
                        JOptionPane.showMessageDialog(null, "ingrese los datos del cliente: ");
                        cliente1.setNumeroAfiliacion(Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de afilacion: ")));
                        cliente1.setNombre(JOptionPane.showInputDialog("ingresa el nombre: "));
                        cliente1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad: ")));
                        cliente1.setDireccion(JOptionPane.showInputDialog("ingresa la direccion: "));
                        cliente1.setRFC(JOptionPane.showInputDialog("ingresa el RFC: "));
                        registro.setlistaClientes(cliente1);
                        break;

                    case 2:
                        Empleado empleado1 = new Empleado();
                        JOptionPane.showMessageDialog(null, "ingresa los datos del emplado");
                        empleado1.setNumeroEmpleado(Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero de empleado: ")));
                        empleado1.setNombre(JOptionPane.showInputDialog("ingresa el nombre del empleado: "));
                        empleado1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingresa tu edad: ")));
                        empleado1.setDireccion(JOptionPane.showInputDialog("ingresa la direccion: "));
                        empleado1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("ingrese su salario: ")));
                        empleado1.setHorario(JOptionPane.showInputDialog("Ingrese su horario: "));
                        registro.setlistaEmpleado(empleado1);
                        break;

                    case 3:
                        Manager manager1 = new Manager();
                        JOptionPane.showMessageDialog(null, "ingresa los datos del Manager");
                        manager1.setNombre(JOptionPane.showInputDialog("Ingrese su nombre: "));
                        manager1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad: ")));
                        manager1.setDireccion(JOptionPane.showInputDialog("Ingrese su direccion: "));
                        manager1.setRFC(JOptionPane.showInputDialog("ingrese su RFC: "));
                        registro.setlistaManager(manager1);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Eliminar un registro de Cliente");
                        int numeroAfiliacion = Integer.parseInt(JOptionPane.showInputDialog("ingresa el Numero de Afiliacion de el empleado a eliminar: "));
                        registro.deleteRegistrodeClientes(numeroAfiliacion);
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Elimnar un registro de Empleado");
                        int NumeroEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleado ha eliminar: "));
                        registro.deleteRegistroEmpleado(NumeroEmpleado);
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Mostrar la lista de Clientes");
                        List<Cliente> showlistaClientesList = new ArrayList<>(registro.getListaClientes());
                        for (Cliente ListadeClientes : showlistaClientesList) {
                            JOptionPane.showMessageDialog(null, "El numero de afileacion del cliente es: " + ListadeClientes.getNumeroAfiliacion());
                            JOptionPane.showMessageDialog(null, "El nombre del Cliente es: " + ListadeClientes.getNombre());
                            JOptionPane.showMessageDialog(null, "La edad del cliente es: " + ListadeClientes.getEdad());
                            JOptionPane.showMessageDialog(null, "La direccion del cliente es: " + ListadeClientes.getDireccion());
                            JOptionPane.showMessageDialog(null, "El RFC del cliente es: " + ListadeClientes.getRFC());
                        }
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Mostrar la lista de Empleados");
                        List<Empleado> showlistaEmpleadoList = new ArrayList<>(registro.getListaEmpleado());
                        for (Empleado ListadeEmpleados : showlistaEmpleadoList) {
                            JOptionPane.showMessageDialog(null, "El numero del empleado es: " + ListadeEmpleados.getNumeroEmpleado());
                            JOptionPane.showMessageDialog(null, "El nombre del empleado es: " + ListadeEmpleados.getNombre());
                            JOptionPane.showMessageDialog(null, "La edad del empleado es: " + ListadeEmpleados.getEdad());
                            JOptionPane.showMessageDialog(null, "La direccion del empleado es: " + ListadeEmpleados.getDireccion());
                            JOptionPane.showMessageDialog(null, "El salario del empleado es: " + ListadeEmpleados.getSalario());
                            JOptionPane.showMessageDialog(null, "El horario del empleado es: " + ListadeEmpleados.getHorario());
                        }
                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Ingresa el numero de afiliacion del empleado al cual se le mostraran sus datos: ");
                        int numerodeAfilicion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de afiliacion: "));
                        registro.mostarRegistroCliente(numerodeAfilicion);
                        break;

                    case 9:
                        JOptionPane.showMessageDialog(null, "Ingresa el numero de Empleado al cual se le mostraran sus datos");
                        int numerodeEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleado: "));
                        registro.mostrarRegistroEmpleado(numerodeEmpleado);
                }
                opcion = JOptionPane.showInputDialog("Desea realializar otra accion? (si)(no): ");
            }while (opcion.equals("si") || opcion.equals("SI") || opcion.equals("Si")) ;
        }
        /*Tiempo tiempo1 = new Tiempo();
        tiempo1.setHora(1);
        tiempo1.setMinutos(60);
        tiempo1.setSegundos(20);

        Tiempo tiempo2 = new Tiempo();
        tiempo2.setHora(6);
        tiempo2.setMinutos(30);
        tiempo2.setSegundos(10);*/
    }
}






