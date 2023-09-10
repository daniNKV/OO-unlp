package unlp.ar.oo.ejercicio4;

public class Cuadrado implements FiguraRegular {
    private double lado;

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        int ladosCuadrado = 4;
        return this.getLado() * ladosCuadrado;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getLado(), 2);
    }

}
