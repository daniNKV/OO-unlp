package unlp.ar.oo.ejercicio15;

import unlp.ar.oo.ejercicio14.DateLapse;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Propiedad {
    private String nombre;
    private String descripcion;
    private String direccion;
    private double precioPorNoche;
    private Usuario propietario;
    private PoliticaCancelacion politica;
    private Set<Reserva> reservasRecibidas;

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
        this.reservasRecibidas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public PoliticaCancelacion getPolitica() {
        return politica;
    }

    public void eliminarReserva(Reserva reserva) {
        this.reservasRecibidas.remove(reserva);
    }

    public void agregarReserva(Reserva reserva) {
        this.reservasRecibidas.add(reserva);
    }

    public double recaudacionEntreFechas(LocalDate desde, LocalDate hasta) {
        DateLapse lapsoACalcular = new DateLapse(desde, hasta);
        return reservasRecibidas.stream()
                .filter(reserva -> new DateLapse(reserva.desdeFecha, reserva.hastaFecha).overlaps(lapsoACalcular))
                .mapToDouble(Reserva::precioTotal)
                .sum();
    }

    public boolean estaLibre(LocalDate desde, LocalDate hasta) {
        DateLapse lapsoReserva = new DateLapse(desde, hasta);
        return reservasRecibidas.stream()
                .noneMatch(reserva -> new DateLapse(reserva.desdeFecha, reserva.hastaFecha).overlaps(lapsoReserva));
    }

}
