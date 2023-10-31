package unlp.ar.oo.ejercicio21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pasajero extends Usuario {
    private List<Viaje> viajesRealizados;
    public Pasajero(String nombre) {
        super(nombre);
        this.viajesRealizados = new ArrayList<>();
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
            return monto;
        }
    }

    public Boolean tieneSaldo() {
        return this.getSaldo() > 0;
    }

    private Boolean viajoEnLosUltimos30Dias() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaHaceUnMes = fechaActual.minusDays(30);
        return this.viajesRealizados.stream()
                .anyMatch(viaje -> viaje.getFechaViaje().isAfter(fechaHaceUnMes));
    }

    private Boolean realizoViaje() {
        return !this.viajesRealizados.isEmpty();
    }

    public void agregarViaje(Viaje viaje) {
        this.viajesRealizados.add(viaje);
    }
}
