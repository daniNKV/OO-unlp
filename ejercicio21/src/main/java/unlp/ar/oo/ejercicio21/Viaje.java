package unlp.ar.oo.ejercicio21;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Viaje {
    private String origen;
    private String destino;
    private double costoTotal;
    private LocalDate fechaViaje;
    private Set<Usuario> viajeros;
    private Vehiculo vehiculo;

    public Viaje(String origen, String destino, double costoTotal, LocalDate fechaViaje, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.costoTotal = costoTotal;
        this.fechaViaje = fechaViaje;
        this.vehiculo = vehiculo;
        this.viajeros = new HashSet<>();
        this.viajeros.add(vehiculo.getConductor());
    }

    public Boolean agregarPasajero(Pasajero pasajero) {
        if (quedaLugarDisponible() && pasajero.tieneSaldo() && suficienteAntelacion()) {
            this.viajeros.add(pasajero);
            pasajero.agregarViaje(this);
            return true;
        } else {
            return false;
        }
    }

    private Boolean quedaLugarDisponible() {
        return this.vehiculo.getCapacidad() > this.cantidadViajeros();
    }

    private Boolean suficienteAntelacion() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate dosDiasAntes = fechaViaje.minusDays(2);
        return dosDiasAntes.isAfter(fechaActual) || dosDiasAntes.isEqual(fechaActual);
    }

    public Boolean esManana() {
        return fechaViaje.isEqual(LocalDate.now().plusDays(1));
    }

    public int cantidadViajeros() {
        return this.viajeros.size();
    }
    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void cobrarViaje() {
        double montoPorViajero = this.costoTotal / cantidadViajeros();
        this.viajeros.forEach(viajero -> viajero.pagarViaje(montoPorViajero));
    }
}
