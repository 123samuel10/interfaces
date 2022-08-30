import javax.swing.*;

public class Logica {

    Empleado empleado[]=new Empleado[5];
    int suma=0;
    PersonImplements mostrar=new PersonImplements();
    int cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de empleado"));

    public void añadir(){
        for (int i=0;i<cantidad;i++){
            if (cantidad>= empleado.length){
                JOptionPane.showMessageDialog(null,"ya no hay dispobibilidad");
                break;
            }
           String nombreEmpleado=mostrar.nombre();
            int cantidad=mostrar.cantidad();
            int precio=mostrar.precio();
            suma=cantidad*precio;
           empleado[i]=new Empleado(nombreEmpleado,precio,cantidad);
            JOptionPane.showMessageDialog(null,suma);
        }

    }
    public void buscar(){
        for (int i=0;i< empleado.length;i++){
            String nombre=JOptionPane.showInputDialog("ingrese un nombre para buscar");
            if (empleado[i]!=null && empleado[i].getNombre().equals(nombre)){
                JOptionPane.showMessageDialog(null,"CANTIDAD: "+empleado[i].getCantidad()+"PRECIO: "+empleado[i].getPrecio() );

            }
        }
    }
    public void mayor(){
        int cantidadMayor=0;
        for (int i=0;i< empleado.length;i++){
            if (empleado[i]!=null && empleado[i].getCantidad()>cantidadMayor){
                cantidadMayor=empleado[i].getCantidad();

            }
        }
        for (int i=0;i<empleado.length;i++){
            if (empleado[i]!=null && empleado[i].getCantidad()==cantidadMayor){
                JOptionPane.showMessageDialog(null,"la cantidad mayor es: "+cantidadMayor+"obtenida por el empleado "+empleado[i].getNombre());
            }
        }
    }
    public void menor(){
        int menoBuscar=empleado[0].getCantidad();
        for (int i=0;i<empleado.length;i++){
            if (empleado[i]!=null && empleado[i].getCantidad()<menoBuscar){
                menoBuscar=empleado[i].getCantidad();
            }
        }
        for (int i=0;i<empleado.length;i++){
            if (empleado[i]!=null && empleado[i].getCantidad()==menoBuscar){
                JOptionPane.showMessageDialog(null,"la cantidad menor es: "+menoBuscar+"obtenida por el empleado: "+empleado[i].getNombre());
            }
        }
    }
}
