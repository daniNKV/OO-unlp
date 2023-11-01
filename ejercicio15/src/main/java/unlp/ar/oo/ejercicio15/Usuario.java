package unlp.ar.oo.ejercicio15;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Usuario {
    private String nombre;
    private Integer dni;
    private String direccion;
    private Set<Propiedad> propiedades;
    private Set<Reserva> reservasRealizadas;
    public Usuario(String nombre, Integer dni, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.reservasRealizadas = new HashSet<>();
        this.propiedades = new HashSet<>();
    }

    public List<Reserva> getReservas() {
        return reservasRealizadas.stream().toList();
    }

    public void agregarPropiedad(Propiedad propiedad) {
        this.propiedades.add(propiedad);
    }

    public void agregarReserva(Reserva reserva) {
        this.reservasRealizadas.add(reserva);
    }
    public void eliminarReserva(Reserva reserva) {
        this.reservasRealizadas.remove(reserva);
    }

    public double calcularIngresos(LocalDate desde, LocalDate hasta) {
        return this.propiedades.stream()
                .mapToDouble(propiedad -> propiedad.recaudacionEntreFechas(desde, hasta))
                .sum();
    }

    public List<Propiedad> propiedadesDisponibles(LocalDate desde, LocalDate hasta) {
        return this.propiedades.stream()
                .filter(propiedad -> propiedad.estaLibre(desde, hasta))
                .collect(Collectors.toList());
    }

}
