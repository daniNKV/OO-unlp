package unlp.ar.oo.ejercicio15;

import unlp.ar.oo.ejercicio14.DateLapse;

import java.time.LocalDate;

public class Reserva {
    Propiedad propiedad;
    Usuario inquilino;
    LocalDate desdeFecha;
    LocalDate hastaFecha;

    public Reserva(Propiedad propiedad, Usuario inquilino, LocalDate desdeFecha, LocalDate hastaFecha) {
        this.propiedad = propiedad;
        this.inquilino = inquilino;
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public Usuario getInquilino() {
        return inquilino;
    }

    public double precioTotal() {
        DateLapse lapso = new DateLapse(this.desdeFecha, this.hastaFecha);
        return lapso.sizeInDays() * propiedad.getPrecioPorNoche();
    }
    public void eliminar() {
        this.propiedad.eliminarReserva(this);
        this.inquilino.eliminarReserva(this);
    }
    public double calcularReembolso(LocalDate fechaTentativa) {
        double porcentajeReembolso;
        porcentajeReembolso = propiedad.getPolitica().calcularPorcentajeReembolso(desdeFecha, fechaTentativa);
        return precioTotal() * porcentajeReembolso;
    }
}
