package unlp.ar.oo.ejercicio18;

import unlp.ar.oo.ejercicio14.DateLapse;

import java.time.LocalDate;

public class ContratoPorHora extends Contrato {
    private LocalDate fechaFinalizacion;
    private double montoPorHora;
    private int horasPorMes;

    public ContratoPorHora(Empleado empleado, LocalDate fechaInicio, LocalDate fechaFinalizacion, double montoPorHora, int horasPorMes) {
        super(fechaInicio, empleado);
        this.fechaFinalizacion = fechaFinalizacion;
        this.montoPorHora = montoPorHora;
        this.horasPorMes = horasPorMes;
    }

    @Override
    public double calcularMonto(int antiguedad) {
        double montoBasico = montoPorHora * horasPorMes;
        double montoAntiguedad = montoBasico * porcentajePorAntiguedad(antiguedad);
        return montoBasico + montoAntiguedad;
    }

    @Override
    public Boolean estaActivo() {
        return this.fechaFinalizacion.isAfter(LocalDate.now());
    }

    @Override
    public Integer duracion() {
        return new DateLapse(this.getFechaInicio(), this.fechaFinalizacion).sizeInDays() / 365;
    }


}
