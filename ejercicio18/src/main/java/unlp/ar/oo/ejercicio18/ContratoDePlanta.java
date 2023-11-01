package unlp.ar.oo.ejercicio18;

import unlp.ar.oo.ejercicio14.DateLapse;

import java.time.LocalDate;

public class ContratoDePlanta extends Contrato {
    private double sueldoMensual;
    private double montoPorConyuge;
    private double montoPorHijos;

    public ContratoDePlanta(Empleado empleado, LocalDate fechaInicio, double sueldoMensual, double montoPorConyuge, double montoPorHijos) {
        super(fechaInicio, empleado);
        this.sueldoMensual = sueldoMensual;
        this.montoPorConyuge = montoPorConyuge;
        this.montoPorHijos = montoPorHijos;
    }

    @Override
    public double calcularMonto(int antiguedad) {
        double montoBasico = sueldoMensual + montoPorFamilia();
        double montoAntiguedad = montoBasico * porcentajePorAntiguedad(antiguedad);
        return montoBasico + montoAntiguedad;
    }

    public double montoPorFamilia() {
        double montoConyuge = this.getEmpleado().getTieneConyuge() ? montoPorConyuge : 0.0;
        double montoHijos = this.getEmpleado().getTieneHijos() ? montoPorHijos : 0.0;

        return montoConyuge + montoHijos;
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
