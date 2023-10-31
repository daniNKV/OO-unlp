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

    public void registrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void registrarViaje(Viaje viaje) { this.viajes.add(viaje); }

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
