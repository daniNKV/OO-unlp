package ar.edu.unlp.info.oo1;

import java.time.LocalDate;
import java.util.Date;

public class Ticket {
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;

    public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal) {
        this.fecha = LocalDate.now();
        this.cantidadDeProductos = cantidadDeProductos;
        this.pesoTotal = pesoTotal;
        this.precioTotal = precioTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double impuesto() {
        double porcentajeImpuestos = 0.21;
        return this.precioTotal * porcentajeImpuestos;
    }
}
