package unlp.ar.oo.ejercicio11;

public class InversionEnAcciones implements Inversion{
    private String nombre;
    private Integer cantidad;
    private double valorUnitario;

    public InversionEnAcciones(String nombre, Integer cantidad, double valorUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public double valorActual() {
        return cantidad * valorUnitario;
    }
}
