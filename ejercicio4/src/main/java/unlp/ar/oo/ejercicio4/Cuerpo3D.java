package unlp.ar.oo.ejercicio4;

public class Cuerpo3D implements Cuerpo {
    private FiguraRegular directriz;
    private double generatriz;

    @Override
    public void setAltura(double altura) {
        this.generatriz = altura;
    }

    @Override
    public double getAltura() {
        return this.generatriz;
    }

    @Override
    public void setCaraBasal(FiguraRegular cara) {
        this.directriz = cara;
    }

    @Override
    public double getVolumen() {
        return this.directriz.getArea() * this.getAltura();
    }

    @Override
    public double getSuperficieExterior() {
        return directriz.getArea() * 2 + directriz.getPerimetro() * getAltura();
    }
}
