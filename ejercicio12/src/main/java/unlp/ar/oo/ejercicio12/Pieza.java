package unlp.ar.oo.ejercicio12;

public abstract class Pieza {
    private String material;
    private String color;
    protected abstract double getVolumen();
    protected abstract double getSuperficie();
}
