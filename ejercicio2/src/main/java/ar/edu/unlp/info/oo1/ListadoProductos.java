package ar.edu.unlp.info.oo1;

import java.util.ArrayList;
import java.util.List;

public class ListadoProductos extends ArrayList<Producto> {
    List<Producto> productos;

    public ListadoProductos() {
        this.productos = new ArrayList<>();
    }

    public ListadoProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void agregar(Producto producto) {
        this.productos.add(producto);
    }

    public void reset() { this.productos = new ArrayList<>(); }

    public Double getPesoTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPeso)
                .reduce(0, Double::sum);
    }

    public Double getPrecioTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .reduce(0, Double::sum);
    }

}
