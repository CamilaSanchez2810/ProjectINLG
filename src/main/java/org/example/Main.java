package org.example;
import javax.swing.JOptionPane;
public class Main extends Tiempo {

    {
        Tiempo tiempo1 = new Tiempo();
        tiempo1.setHora(1);
        tiempo1.setMinutos(6);
        tiempo1.setSegundos(0);

        Tiempo tiempo2 = new Tiempo();
        tiempo1.setHora(1);
        tiempo1.setMinutos(6);
        tiempo1.setSegundos(0);
        JOptionPane.showMessageDialog(null, "El tiempo es: " + tiempo1.toString());
    }
}
