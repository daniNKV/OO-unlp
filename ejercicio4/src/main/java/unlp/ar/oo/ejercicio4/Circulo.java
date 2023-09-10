package unlp.ar.oo.ejercicio4;

public class Circulo implements FiguraRegular {
    private double radio;

    public double getDiametro() {
        return this.radio * 2;
    }

    public void setDiametro(double diametro) {
        this.radio = diametro / 2;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getPerimetro() {
        return this.getDiametro() * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }

}
