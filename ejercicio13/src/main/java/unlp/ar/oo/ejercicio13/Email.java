package unlp.ar.oo.ejercicio13;

import java.util.Set;

public class Email {
    String titulo;
    String cuerpo;
    Set<Archivo> archivos;

    public Email(String titulo, String cuerpo, Set<Archivo> archivos) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.archivos = archivos;
    }

    public Email(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Set<Archivo> getArchivos() {
        return archivos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Integer size() {
        return titulo.length() + cuerpo.length() + archivos.stream()
                .mapToInt(Archivo::size)
                .sum();
    }

    public boolean contieneCadena(String texto) {
        return cuerpo.contains(texto) || titulo.contains(texto);
    }
}
