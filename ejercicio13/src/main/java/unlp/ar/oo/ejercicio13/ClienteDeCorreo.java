package unlp.ar.oo.ejercicio13;

import java.util.*;

public class ClienteDeCorreo {
    Carpeta inbox;
    Set<Carpeta> carpetas;

    public ClienteDeCorreo() {
        Carpeta inbox = new Carpeta("Inbox");
        this.carpetas = new HashSet<>();
        this.carpetas.add(inbox);
    }

    public void recibir(Email email) {
        this.inbox.agregarEmail(email);
    }

    public void mover(Email email, Carpeta carpetaOrigen, Carpeta carpetaDestino) {
        carpetaOrigen.eliminarEmail(email);
        carpetaDestino.agregarEmail(email);
    }

    public Optional<Carpeta> buscar(String texto) {
        return this.carpetas.stream()
                .filter(carpeta -> carpeta.buscarEmail(texto).isPresent())
                .findFirst();
    }

    public Integer espacioOcupado() {
        return this.carpetas.stream()
                .mapToInt(Carpeta::size)
                .sum();
    }


}
