package unlp.ar.oo.ejercicio5;
public class Ancestros implements Genealogia {
    private Mamifero madre;
    private Mamifero padre;

    public Ancestros() {}

    @Override
    public Mamifero getMadre() { return madre != null ? madre : null; }
    @Override
    public void setMadre(Mamifero madre) { this.madre = madre; }
    @Override
    public Mamifero getPadre() { return padre != null ? padre : null; }
    @Override
    public void setPadre(Mamifero padre) { this.padre = padre; }
    @Override
    public Mamifero getAbueloMaterno() { return madre != null ? madre.getPadre() : null; }
    @Override
    public Mamifero getAbuelaMaterna() { return madre != null ? madre.getMadre() : null; }
    @Override
    public Mamifero getAbueloPaterno() { return padre != null ? padre.getPadre() : null; }
    @Override
    public Mamifero getAbuelaPaterna() { return padre != null ? padre.getMadre() : null; }
    @Override
    public Boolean esAncestro(Mamifero ancestro) {
        if (madre == ancestro || padre == ancestro) { return true; }
        return isAncestroDe(madre, ancestro) || isAncestroDe(padre, ancestro);
    }

    private boolean isAncestroDe(Mamifero progenitor, Mamifero ancestro) {
        return progenitor != null && progenitor.tieneComoAncestroA(ancestro);
    }

}
