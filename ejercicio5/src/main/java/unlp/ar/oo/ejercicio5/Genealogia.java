package unlp.ar.oo.ejercicio5;

public interface Genealogia {
    void setPadre(Mamifero padre);
    Mamifero getPadre();
    void setMadre(Mamifero madre);
    Mamifero getMadre();
    Mamifero getAbueloMaterno();
    Mamifero getAbuelaMaterna();
    Mamifero getAbueloPaterno();
    Mamifero getAbuelaPaterna();
    Boolean esAncestro(Mamifero ancestro);

}
