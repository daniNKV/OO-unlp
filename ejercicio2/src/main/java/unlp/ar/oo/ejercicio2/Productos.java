package unlp.ar.oo.ejercicio2;

import java.util.ArrayList;
import java.util.List;

class Productos implements ListadoProductos {
    List<Producto> productos;

    public Productos() {
        this.productos = new ArrayList<>();
    }
    public List<Producto> getProductos() {
        return this.productos;
    }

    public int getCantidad() {
        return this.productos.size();
    }

    public void agregar(Producto producto) {
        this.productos.add(producto);
    }

    public void vaciar() { this.productos = new ArrayList<>(); }

    public double getPesoTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPeso)
                .reduce(0, Double::sum);
    }

    public double getPrecioTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .reduce(0, Double::sum);
    }


}
