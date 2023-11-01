package unlp.ar.oo.ejercicio17;

import java.time.LocalDate;
import java.util.List;

public abstract class Cliente {
    private String nombre;
    private String direccion;
    private NumeroTelefonico numero;

    public Cliente(String nombre, String direccion, NumeroTelefonico numero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void agregarNumeroTelefonico(NumeroTelefonico numero) {
        this.numero = numero;
    }

    public NumeroTelefonico getNumero() {
        return numero;
    }

    public Factura facturarLlamadas(LocalDate fechaDesde, LocalDate fechaHasta, CuadroTarifario tarifas) {
        double montoTotal = this.numero.calcularMontoLlamadas(fechaDesde, fechaHasta, tarifas);
        return new Factura(this, LocalDate.now(), fechaDesde, fechaHasta, calcularMontoAFacturar(montoTotal));
    }

    protected abstract double calcularMontoAFacturar(double montoTotal);

}
