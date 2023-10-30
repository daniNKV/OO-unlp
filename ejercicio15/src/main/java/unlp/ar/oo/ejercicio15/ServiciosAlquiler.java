package unlp.ar.oo.ejercicio15;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ServiciosAlquiler {
    private Set<Usuario> usuarios;

    private ServiciosAlquiler() {
        this.usuarios = new HashSet<>();
    }

    public void registrarUsuario(String nombre, Integer dni, String direccion) {
        this.usuarios.add(new Usuario(nombre, dni, direccion));
    }

    public List<Reserva> obtenerReservasInquilino(Usuario inquilino) {
        return inquilino.getReservas();
    }

    public List<Propiedad> buscarPropiedadesDisponibles(LocalDate desde, LocalDate hasta) {
        return this.usuarios.stream()
                .flatMap(usuario -> usuario.propiedadesDisponibles(desde, hasta).stream())
                .collect(Collectors.toList());
    }

}
