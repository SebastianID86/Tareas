/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author SEBASTIAN
 */
public class Venta {
    private ArrayList<Producto> productos;

    public Venta() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(p -> p.getNombre().equals(nombre));
    }

    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public void ordenarProductosPorPrecio() {
        Collections.sort(productos);
    }
    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

}
