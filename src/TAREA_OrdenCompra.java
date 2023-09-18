import javax.xml.crypto.Data;
import java.time.Instant;
import java.util.Date;

public class TAREA_OrdenCompra {
     private Integer identificador;
     private static int ultimoIdentificador;
     private String descripción;
     private Date fecha;
     private Cliente cliente;
     private Producto[] productos;
     private int indiceProductos;


    //====================CONSTRUCTOR====================//
    public TAREA_OrdenCompra(String descripción) {
        this.identificador = ++ultimoIdentificador;
        this.descripción = descripción;
        this.fecha = new Date();
        this.productos = new Producto[4];
    }
    //====================CONSTRUCTOR====================//


    //====================GETTER====================//
    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripción() {
        return descripción;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProducto() {
        return productos;
    }
    //====================GETTER====================//


    //====================SETTER====================//
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //====================SETTER====================//


    //====================Agregar Productos (add)====================//
    public TAREA_OrdenCompra addProductos(Producto producto){
        if (indiceProductos < this.productos.length){
            this.productos[indiceProductos++] = producto;
        }
        return this;
    }

    //====================Agregar Productos (add)====================//


    //====================MÉTODO GRAN_TOTAL====================//
    public String Gran_TOTAL(){
        int Total = 0;
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("===============================================================");
        mensaje.append("\n\t***Gran TOTAL, sumando los precios de los productos***");
        mensaje.append("\n===============================================================");
        mensaje.append("\nCliente: ").append(cliente.toString());
        mensaje.append("\nN° identificador = ").append(getIdentificador());
        mensaje.append("\nDescripción = ").append(getDescripción());
        mensaje.append("\nFecha = ").append(getFecha()).append("\n");
        for (Producto producto : productos) {
            mensaje.append("\n"+producto.getFabricante()+"\t\t"+producto.getNombre() + "\t\t" + producto.getPrecio());
            Total = Total + producto.getPrecio();
        }
        mensaje.append("\n------------------------------------------------------");
        mensaje.append("\n\t\t\t\t\t\t TOTAL: " + Total);
        mensaje.append("\n===============================================================");
        return mensaje.toString();
    }
    //====================MÉTODO GRAN_TOTAL====================//

    @Override
    public String toString() {
        return "cliente = " + cliente;
    }

}
