package unlp.ar.oo.ejercicio19;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private String ubicacion;

    public Producto(String nombre, String descripcion, double precio, int stock, String ubicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getUbicacion() { return ubicacion; }

    public Boolean hayStock(int cantidad) {
        return this.stock >= cantidad;
    }

    public void quitarStock(int cantidad) {
        if (hayStock(cantidad)) {
            this.stock -= cantidad;
        }
    }

}
