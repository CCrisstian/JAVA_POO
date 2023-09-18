public class Producto {
    private String fabricante;
    private String nombre;
    private int precio;

    //==========CONSTRUCTOR==========//
    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }
    //==========CONSTRUCTOR==========//


    //==========GETTER==========//
    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    //==========GETTER==========//

    @Override
    public String toString() {
        return fabricante + " " + nombre + " " + precio;
    }
}
