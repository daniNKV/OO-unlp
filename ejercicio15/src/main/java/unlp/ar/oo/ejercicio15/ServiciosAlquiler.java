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

    public Propiedad registrarPropiedad(String nombre, double precio, String descripcion, String direccion, Usuario propietario, PoliticaCancelacion politica) {
        Propiedad propiedad = new Propiedad(nombre, descripcion, direccion, precio, propietario, politica);
        propietario.agregarPropiedad(propiedad);
        return propiedad;
    }

    public double calcularIngresosPropietario(Usuario propietario, LocalDate desde, LocalDate hasta) {
        return propietario.calcularIngresos(desde, hasta);
    }

    public double calcularValorDeReserva(Reserva reserva) {
        return reserva.precioTotal();
    }

    public List<Reserva> obtenerReservasInquilino(Usuario inquilino) {
        return inquilino.getReservas();
    }

    public void efectuarReserva(Propiedad propiedad, Usuario inquilino, LocalDate desde, LocalDate hasta) {
        Reserva reserva = new Reserva(propiedad, inquilino, desde, hasta);
        propiedad.agregarReserva(reserva);
        inquilino.agregarReserva(reserva);
    }

    public void eliminarReserva(Reserva reserva) {
        reserva.getPropiedad().eliminarReserva(reserva);
    }

    public List<Propiedad> buscarPropiedadesDisponibles(LocalDate desde, LocalDate hasta) {
        return this.usuarios.stream()
                .flatMap(usuario -> usuario.propiedadesDisponibles(desde, hasta).stream())
                .collect(Collectors.toList());
    }

}
