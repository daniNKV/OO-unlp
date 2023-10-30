package unlp.ar.oo.ejercicio17;

import java.time.LocalDate;

public class Factura {
    private Cliente cliente;
    private LocalDate fechaFacturacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private double monto;

    public Factura(Cliente cliente, LocalDate fechaFacturacion, LocalDate fechaDesde, LocalDate fechaHasta, double monto) {
        this.cliente = cliente;
        this.fechaFacturacion = fechaFacturacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.monto = monto;
    }
}
