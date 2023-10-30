package unlp.ar.oo.ejercicio19;

public class Pedido {
    Producto producto;
    int cantidad;
    MetodoDePago pago;
    MetodoDeEnvio envio;

    public Pedido(Producto producto, int cantidad, MetodoDePago pago, MetodoDeEnvio envio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.pago = pago;
        this.envio = envio;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double calcularCostoTotal() {
        double precioFinal = this.pago.calcularPrecioFinal(producto.getPrecio() * cantidad);
        double precioEnvio = this.envio.calcularCostoEnvio();

        return precioFinal + precioEnvio;
    }

}
