package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.List;

public class Ticket extends ListadoProductos{
    private LocalDate fecha;
   private double porcentajeImpuestos = 0.21;


    public Ticket(List<Producto> productos) {
        super(productos);
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double impuesto() {
        return super.getPrecioTotal() * this.porcentajeImpuestos;
    }
}
