/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;
import productos.Producto;
import productos.Venta;
import productos.Envio;

/**
 *
 * @author SEBASTIAN
 */
public class Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Leche", "Leche entera de vaca", 3.5, 10);
        Producto p2 = new Producto("Pan", "Pan integral", 2.0, 20);
        Producto p3 = new Producto("Queso", "Queso de cabra", 5.0, 5);
        
        // Agregar productos a la venta
        Venta venta = new Venta();
        venta.agregarProducto(p1);
        venta.agregarProducto(p2);
        venta.agregarProducto(p3);
         System.out.println("Productos ordenados por precio:");
        for (Producto producto : venta.getProductos()) {
            System.out.println(producto.getNombre() + ": " + producto.getPrecio());
        }
        // Buscar y eliminar un producto de la venta
        Producto productoBuscado = venta.buscarProducto("Pan");
        System.out.println("Producto buscado: " + productoBuscado.getNombre());
        System.out.println("Producto eliminado: " + productoBuscado.getNombre());
        venta.eliminarProducto("Pan");
        
        // Ordenar productos por precio
        venta.ordenarProductosPorPrecio();
        System.out.println("Productos ordenados por precio:");
        for (Producto producto : venta.getProductos()) {
            System.out.println(producto.getNombre() + ": " + producto.getPrecio());
        }

        // Calcular costo de envío
        Envio envio = new Envio("Calle 123");
        double costoEnvio = envio.calcularCostoEnvio(150);
        System.out.println("Costo de envío: " + costoEnvio);
    }
}
