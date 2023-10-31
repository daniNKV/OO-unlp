package unlp.ar.oo.ejercicio21;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ServicioPoolCar {
    Set<Usuario> usuarios;
    Set<Viaje> viajes;

    public ServicioPoolCar() {
        this.usuarios = new HashSet<>();
        this.viajes = new HashSet<>();
    }

    public Conductor registrarConductor(String nombre, Vehiculo vehiculo) {
        Conductor nuevoConductor = new Conductor(nombre, vehiculo);
        this.usuarios.add(nuevoConductor);
        return nuevoConductor;
    }

    public Pasajero registrarPasajero(String nombre) {
        Pasajero nuevoPasajero = new Pasajero(nombre);
        this.usuarios.add(nuevoPasajero);
        return nuevoPasajero;
    }

    public Viaje crearViaje(String origen, String destino, double costo, Vehiculo vehiculo, LocalDate fechaViaje) {
        Viaje nuevoViaje = new Viaje(origen, destino, costo, fechaViaje, vehiculo);
        this.viajes.add(nuevoViaje);
        return nuevoViaje;
    }

    public void cargarMontoDeRegalo(double monto) {
        this.usuarios.forEach(usuario -> usuario.agregarSaldo(monto));
    }

    public List<Usuario> obtenerUsuariosSegunSaldo() {
        List<Usuario> usuarios = new ArrayList<>(this.usuarios);
        usuarios.sort(Comparator.comparingDouble(Usuario::getSaldo));
        return usuarios;
    }

    public List<Viaje> listarViajesDelDiaSiguiente() {
        return this.viajes.stream()
                .filter(Viaje::esManana)
                .collect(Collectors.toList());
    }

    public void procesarViajes() {
        List<Viaje> viajesAProcesar = this.listarViajesDelDiaSiguiente();
        viajesAProcesar.forEach(Viaje::cobrarViaje);
    }
}
