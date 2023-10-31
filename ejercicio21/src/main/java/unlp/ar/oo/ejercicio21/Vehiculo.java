package unlp.ar.oo.ejercicio21;

import java.time.LocalDate;

public class Vehiculo {
    private String descripcion;
    private int capacidad;
    private int fabricacion;
    private double valorDeMercado;
    private Conductor conductor;

    public Vehiculo(String descripcion, int capacidad, int fabricacion, double valorDeMercado) {
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.fabricacion = fabricacion;
        this.valorDeMercado = valorDeMercado;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public double getValorDeMercado() {
        return valorDeMercado;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public int antiguedadEnAnios() {
        return LocalDate.now().getYear() - this.fabricacion;
    }
}
