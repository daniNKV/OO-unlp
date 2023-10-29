package unlp.ar.oo.ejercicio17;

import unlp.ar.oo.ejercicio14.DateLapse;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato {
    private double sueldoMensual;
    private double montoPorConyuge;
    private double montoPorHijos;

    public ContratoDePlanta(LocalDate fechaInicio, double sueldoMensual, double montoPorConyuge, double montoPorHijos) {
        super(fechaInicio);
        this.sueldoMensual = sueldoMensual;
        this.montoPorConyuge = montoPorConyuge;
        this.montoPorHijos = montoPorHijos;
    }

    @Override
    public double calcularMonto(int antiguedad) {
        double montoBasico = sueldoMensual + montoPorConyuge + montoPorHijos;
        double montoAntiguedad = montoBasico * montoPorAntiguedad(antiguedad);
        return montoBasico + montoAntiguedad;
    }

    @Override
    public Boolean estaActivo() {
        return true;
    }

    @Override
    public Integer duracion() {
        return new DateLapse(this.getFechaInicio(), LocalDate.now()).sizeInDays() / 365;
    }
}
