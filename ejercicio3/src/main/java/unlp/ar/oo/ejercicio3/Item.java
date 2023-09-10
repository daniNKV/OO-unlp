package unlp.ar.oo.ejercicio3;

public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario;

    public Item(String detalle, int cantidad, double costoUnitario) {
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
    }

    public double costo() {
        return getCantidad() * getCostoUnitario();
    }
    public String getDetalle() {
        return this.detalle;
    }
    public int getCantidad() {
        return this.cantidad;
    }

    public double getCostoUnitario() {
        return this.costoUnitario;
    }
}
