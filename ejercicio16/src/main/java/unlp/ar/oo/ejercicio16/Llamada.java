package unlp.ar.oo.ejercicio16;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public abstract class Llamada {
    private LocalDate fecha;
    private LocalTime hora;
    private double duracion;
    private Cliente clienteDestino;
    private Cliente clienteOrigen;

    public Llamada(LocalDate fecha, LocalTime hora, double duracion, Cliente clienteDestino, Cliente clienteOrigen) {
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.clienteDestino = clienteDestino;
        this.clienteOrigen = clienteOrigen;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public double getDuracion() {
        return duracion;
    }

    protected abstract double calcularCosto();
}
