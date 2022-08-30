public class Empleado extends Persona{
    private int cantidad;
    private int precio;
    public Empleado(String nombre,int precio,int cantidad) {
        super(nombre);
        this.precio=precio;
        this.cantidad=cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
