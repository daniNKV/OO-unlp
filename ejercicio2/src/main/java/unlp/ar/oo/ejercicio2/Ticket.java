package unlp.ar.oo.ejercicio2;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
    private LocalDate fecha;
    private double porcentajeImpuestos = 0.21;
    private ListadoProductos productos;

    public Ticket(ListadoProductos productos) {
        this.productos = productos;
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double impuesto() {
        return productos.getPrecioTotal() * porcentajeImpuestos;
    }
    public List<Producto> getProductos() { return productos.getProductos(); }

    public double getPesoTotal() { return productos.getPesoTotal(); }

    public double getPrecioTotal() { return productos.getPrecioTotal(); }

    public int getCantidadDeProductos() { return productos.getCantidad(); }
}
