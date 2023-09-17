package unlp.ar.oo.ejercicio5;

import java.time.LocalDate;

public class Mamifero {
    private String identificador;
    private String especie;
    private LocalDate fechaDeNacimiento;
    private final Genealogia antepasados;

    public Mamifero() {
        this.antepasados = new Ancestros();
    }

    public Mamifero(String identificador) {
        this();
        this.identificador = identificador;
    }

    public String getIdentificador() { return identificador; }
    public void setIdentificador(String id) { this.identificador = id; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public Mamifero getMadre() { return antepasados.getMadre(); }
    public void setMadre(Mamifero madre) { this.antepasados.setMadre(madre); }
    public Mamifero getPadre() { return antepasados.getPadre(); }
    public void setPadre(Mamifero padre) { this.antepasados.setPadre(padre); }
    public Mamifero getAbueloMaterno() { return antepasados.getAbueloMaterno(); }
    public Mamifero getAbuelaMaterna() { return this.antepasados.getAbuelaMaterna(); }
    public Mamifero getAbueloPaterno() { return this.antepasados.getAbueloPaterno(); }
    public Mamifero getAbuelaPaterna() { return this.antepasados.getAbuelaPaterna(); }
    public LocalDate getFechaDeNacimiento() { return fechaDeNacimiento; }
    public void setFechadeNacimiento(LocalDate fechadeNacimiento) { this.fechaDeNacimiento = fechadeNacimiento; }
    public boolean tieneComoAncestroA(Mamifero ancestro) { return this.antepasados.esAncestro(ancestro); }
}
