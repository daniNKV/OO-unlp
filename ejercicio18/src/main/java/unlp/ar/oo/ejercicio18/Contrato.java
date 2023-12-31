package unlp.ar.oo.ejercicio18;

import java.time.LocalDate;

public abstract class Contrato {
    private LocalDate fechaInicio;
    private Empleado empleado;

    protected Empleado getEmpleado() {
        return empleado;
    }

    public Contrato(LocalDate fechaInicio, Empleado empleado) {
        this.empleado = empleado;
        this.fechaInicio = fechaInicio;
    }

    public double porcentajePorAntiguedad(int antiguedad) {
        if (antiguedad < 5) return 0.0;
        else if (antiguedad < 10) return 0.3;
        else if (antiguedad < 15) return 0.5;
        else if (antiguedad < 20) return 0.75;
        return 1.0;
    }

    public abstract double calcularMonto(int antiguedad);

    public abstract Boolean estaActivo();

    public abstract Integer duracion();

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
}
