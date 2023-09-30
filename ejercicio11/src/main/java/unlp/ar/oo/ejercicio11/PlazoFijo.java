package unlp.ar.oo.ejercicio11;

import java.time.LocalDate;
import java.time.Period;

public class PlazoFijo implements Inversion {
    private LocalDate fechaDeConstitucion;
    private double montoDepositado;
    private double porcentajeDeInteresDiario;

    public PlazoFijo(double montoDepositado, double porcentajeDeInteresDiario) {
        this.fechaDeConstitucion = LocalDate.now();
        this.montoDepositado = montoDepositado;
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }

    public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
        this.fechaDeConstitucion = fechaDeConstitucion;
        this.montoDepositado = montoDepositado;
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }

    @Override
    public double valorActual() {
        int diasTranscurridos = Period.between(fechaDeConstitucion, LocalDate.now()).getDays();
         return montoDepositado * Math.pow(1 + porcentajeDeInteresDiario / 100, diasTranscurridos);
    }
}
