package unlp.ar.oo.ejercicio8;

import java.time.LocalDate;
import java.util.Date;

public class Factura {
    private Usuario usuario;
    private Double montoEnergiaActiva;
    private Double descuento;
    private LocalDate fecha;

    public Factura(Usuario usuario, Consumo consumo, Double precioKWh) {
        this.usuario = usuario;
        this.montoEnergiaActiva = consumo.getEnergiaActiva() * precioKWh;
        this.descuento = calcularDescuento(consumo.factorDePotencia());
        this.fecha = LocalDate.now();
    }

    private Double calcularDescuento(Double factorDePotencia) {
        return factorDePotencia > 0.8 ? 0.1 : 0.0;
    }

    public Double montoTotal() { return montoEnergiaActiva - descuento();}

    public Usuario usuario() { return this.usuario; }

    public LocalDate fecha() { return this.fecha; }

    public Double descuento() { return this.descuento * montoEnergiaActiva; }
}
