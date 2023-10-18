package unlp.ar.oo.ejercicio13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Carpeta {
    String nombre;
    List<Email> emails;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.emails = new ArrayList<>();
    }

    public void agregarEmail(Email email) {
        this.emails.add(email);
    }

    public void eliminarEmail(Email email) {
        this.emails.remove(email);
    }

    public String getNombre() {
        return nombre;
    }

    public Optional<Email> buscarEmail(String texto) {
        return emails.stream()
                .filter(email -> email.contieneCadena(texto))
                .findFirst();
    }
    public Integer size() {
        return emails.stream()
                .mapToInt(Email::size)
                .sum();
    }
}
