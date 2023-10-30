package unlp.ar.oo.ejercicio19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vendedor {
    private String nombre;
    private String direccion;
    private List<Producto> productosEnVenta;

    public Vendedor(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productosEnVenta = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Producto agregarProductoEnVenta(String nombre, String descripcion, double precio, int stock) {
        Producto nuevoProducto = new Producto(nombre, descripcion, precio, stock, this.getDireccion());
        this.productosEnVenta.add(nuevoProducto);
        return nuevoProducto;
    }

    public List<Producto> buscarProducto(String nombre) {
        return this.productosEnVenta.stream()
                .filter(producto -> producto.getNombre().equals(nombre))
                .collect(Collectors.toList());
    }

    public int cantidadProductosEnVenta() {
        return this.productosEnVenta.size();
    }
}
