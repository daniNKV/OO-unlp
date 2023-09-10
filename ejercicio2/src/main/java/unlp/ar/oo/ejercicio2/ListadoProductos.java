package unlp.ar.oo.ejercicio2;

import java.util.ArrayList;
import java.util.List;

abstract class ListadoProductos extends ArrayList<Producto> {
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

    public int getCantidadDeProductos() {
        return this.productos.size();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void vaciarProductos() { this.productos = new ArrayList<>(); }

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
