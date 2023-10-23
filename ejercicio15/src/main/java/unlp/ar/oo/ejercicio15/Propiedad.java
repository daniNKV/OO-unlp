package unlp.ar.oo.ejercicio15;

import java.time.LocalDate;
import java.util.HashSet;

public class Propiedad {
    private String nombre;
    private String descripcion;
    private String direccion;
    private double precioPorNoche;
    private Usuario propietario;
    private PoliticaCancelacion politica;
    private HistorialReservas reservasRecibidas;

    public Propiedad(String nombre,
                     String descripcion,
                     String direccion,
                     double precioPorNoche,
                     Usuario propietario,
                     PoliticaCancelacion politica) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.precioPorNoche = precioPorNoche;
        this.politica = politica;
        this.propietario = propietario;
        this.reservasRecibidas = new HistorialReservas();
    }

    public void eliminarReserva(Reserva reserva) {
        this.reservasRecibidas.eliminar(reserva);
    }

    public void agregarReserva(Reserva reserva) {
        this.reservasRecibidas.agregar(reserva);
    }

    public double recaudacionEntreFechas(LocalDate desde, LocalDate hasta) {
        return 0.0;
    }

    public boolean estaLibre(LocalDate desde, LocalDate hasta) {
        return false;
    }
}
