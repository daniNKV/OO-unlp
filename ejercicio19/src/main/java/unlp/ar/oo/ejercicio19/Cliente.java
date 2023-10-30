package unlp.ar.oo.ejercicio19;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String direccion;
    private List<Pedido> pedidosRealizados;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidosRealizados = new ArrayList<Pedido>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void generarPedido(Producto producto, int cantidad, MetodoDePago pago, MetodoDeEnvio envio) {
        if (producto.hayStock(cantidad)) {
            producto.quitarStock(cantidad);
            envio.setDireccionCliente(this.getDireccion());
            envio.setDireccionVendedor(producto.getUbicacion());
            this.pedidosRealizados.add(new Pedido(producto, cantidad, pago, envio));
        }
    }

    public int cantidadPedidosRealizados() {
        return this.pedidosRealizados.size();
    }
}
