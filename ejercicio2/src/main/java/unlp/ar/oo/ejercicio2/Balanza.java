package unlp.ar.oo.ejercicio2;

public class Balanza {
    ListadoProductos productos;

    public Balanza() { this.productos = new Productos(); }

    public Balanza(ListadoProductos listado) { this.productos = listado; }

    public void agregarProducto(Producto producto) { productos.agregar(producto); }

    public double getPrecioTotal() { return productos.getPrecioTotal(); }

    public double getPesoTotal() { return productos.getPesoTotal(); }

    //this.productos.vaciar();
    public void ponerEnCero() { this.productos = new Productos(); }

    public Ticket emitirTicket() { return new Ticket(productos); }

    public int getCantidadDeProductos() { return productos.getCantidad(); }
}
