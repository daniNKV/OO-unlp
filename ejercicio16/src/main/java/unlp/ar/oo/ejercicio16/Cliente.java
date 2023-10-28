package unlp.ar.oo.ejercicio16;

import java.time.LocalDate;

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

    public NumeroTelefonico getNumero() {
        return numero;
    }

    protected abstract Factura facturarLlamadas(LocalDate fechaDesde, LocalDate fechaHasta, CuadroTarifario tarifas);

}
