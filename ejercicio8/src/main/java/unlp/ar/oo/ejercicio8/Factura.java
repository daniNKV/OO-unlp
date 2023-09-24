package unlp.ar.oo.ejercicio8;

import java.time.LocalDate;

public class Factura {
    private Usuario usuario;
    private double montoEnergiaActiva;
    private double descuento;
    private LocalDate fecha;

    public Factura(Usuario usuario, Consumo consumo) {
        this.usuario = usuario;
        this.montoEnergiaActiva = consumo.getEnergiaActiva();
        this.descuento = calcularDescuento(consumo.factorDePotencia());
        this.fecha = LocalDate.now();
    }

    public Factura(int montoEnergiaActiva, int descuento, Usuario usuario) {

    }


    private Double calcularDescuento(Double factorDePotencia) {
        return factorDePotencia > 0.8 ? 10.0 : 0.0;
    }

    public Double getMontoEnergiaActiva() { return montoEnergiaActiva;}

    public Usuario getUsuario() { return this.usuario; }

    public LocalDate getFecha() { return this.fecha; }

    public Double getDescuento() { return this.descuento * montoEnergiaActiva; }
}
