package unlp.ar.oo.ejercicio2;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto() {
        this.reset();
    }

    public Producto(double peso, double precioPorKilo, String descripcion) {
        this.peso = peso;
        this.precioPorKilo = precioPorKilo;
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private void reset() {
        this.peso = 0;
        this.precioPorKilo = 0;
        this.descripcion = "Sin descripcion";
    }

    public double getPrecio() {
        return this.getPrecioPorKilo() * this.getPeso();
    }

}
