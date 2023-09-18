import java.util.Arrays;

public class EjemploOrdenes {
    public static void main(String[] args) {
        TAREA_OrdenCompra orden1 = new TAREA_OrdenCompra("Orden de compra 1");
        TAREA_OrdenCompra orden2 = new TAREA_OrdenCompra("Orden de compra 2");
        TAREA_OrdenCompra orden3 = new TAREA_OrdenCompra("Orden de compra 3");

        orden1.setCliente(new Cliente("Cristian","Cristaldo"));
        orden2.setCliente(new Cliente("Yona","Andrade"));
        orden3.setCliente(new Cliente("Samuel","Lugo"));

        orden1.addProductos(new Producto("FabricanteA","ProductoA",10));
        orden1.addProductos(new Producto("FabricanteA","ProductoB",15));
        orden1.addProductos(new Producto("FabricanteA","ProductoC",20));
        orden1.addProductos(new Producto("FabricanteA","ProductoD",25));

        orden2.addProductos(new Producto("FabricanteB","ProductoE",10));
        orden2.addProductos(new Producto("FabricanteB","ProductoF",20));
        orden2.addProductos(new Producto("FabricanteB","ProductoG",30));
        orden2.addProductos(new Producto("FabricanteB","ProductoH",40));

        orden3.addProductos(new Producto("FabricanteC","ProductoI",5));
        orden3.addProductos(new Producto("FabricanteC","ProductoJ",10));
        orden3.addProductos(new Producto("FabricanteC","ProductoK",15));
        orden3.addProductos(new Producto("FabricanteC","ProductoL",20));

        TAREA_OrdenCompra[] ordenes = new TAREA_OrdenCompra[3];
        ordenes[0] = orden1;
        ordenes[1] = orden2;
        ordenes[2] = orden3;

        for (TAREA_OrdenCompra orden: ordenes) {
            System.out.println(orden.Gran_TOTAL() + "\n\n");
        }

    }
}
