package unlp.ar.oo.ejercicio12;

public class Esfera extends Pieza {
    private int radio;

    public Esfera(String material, String color, int radio) {
        super(material, color);
        this.radio = radio;
    }

    public int getRadio() { return radio; }

    @Override
    protected double getVolumen() {
        return ((double) 4 / 3) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    protected double getSuperficie() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
