package unlp.ar.oo.ejercicio8;

import java.util.*;

public class Usuario {
    private String domicilio;
    private String nombre;
    private List<Consumo> mediciones;
    private List<Factura> facturas;
    public Usuario(String nombre, String domicilio) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mediciones = new LinkedList<>();
        this.facturas = new LinkedList<>();
    }

    public String getDomicilio() { return domicilio; }

    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarMedicion(Consumo medicion) {
        this.mediciones.add(medicion);
    }

    public Double ultimoConsumoActiva() {
        return this.ultimoConsumo().getEnergiaActiva();
    }

    private Consumo ultimoConsumo() {
        return this.mediciones.get(mediciones.size() - 1);
    }

    public Factura facturarEnBaseA(Double precioKWh) {
        Factura factura = new Factura(this, ultimoConsumo(), precioKWh);
        this.facturas.add(factura);
        return factura;
    }

    public List<Factura> facturas() {
        return this.facturas;
    }
}
