package unlp.ar.oo.ejercicio21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario {
    private List<Viaje> viajes;
    public Pasajero(String nombre) {
        super(nombre);
        this.viajes = new ArrayList<>();
    }

    @Override
    protected double obtenerBonificacion() {
        if (realizoViaje()) {
            return 500.0;
        } else {
            return 0.0;
        }
    }

    @Override
    protected double calcularComision(double monto) {
        double porcentajeComision = 0.1;
        if (viajoEnLosUltimos30Dias()) {
            return monto * porcentajeComision;
        } else {
            return 0.0;
        }
    }

    public Boolean tieneSaldo() {
        return this.getSaldo() >= 0;
    }

    private Boolean viajoEnLosUltimos30Dias() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaHaceUnMes = fechaActual.minusDays(30);
        return this.viajes.stream()
                .anyMatch(viaje -> viaje.getFechaViaje().isAfter(fechaHaceUnMes) && viaje.getFechaViaje().isBefore(fechaActual));
    }

    private Boolean realizoViaje() {
        return !this.viajes.isEmpty();
    }

    public void agregarViaje(Viaje viaje) {
        this.viajes.add(viaje);
    }

    public int cantidadViajesRealizados() {
        return this.viajes.size();
    }
}
