import javax.swing.*;

public class PersonImplements implements EmpleadoInterface{



    public PersonImplements() {

    }


    @Override
    public String nombre() {
        String nombre= JOptionPane.showInputDialog("ingrese el nombre del empleado");
        return nombre;
    }

    @Override
    public int cantidad() {
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad"));
        return cantidad;
    }

    @Override
    public int precio() {
        int precio=Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio"));
        return precio;
    }
}
