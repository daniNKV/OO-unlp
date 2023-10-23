package unlp.ar.oo.ejercicio15;

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
        return 0.0;
    }
}
