package ar.edu.unlp.info.oo1;

import java.util.List;

public class Balanza extends ListadoProductos {
    public Balanza() {
        this.ponerEnCero();
    }

    public void ponerEnCero() {
        super.reset();
    }

    public void agregarProducto(Producto producto) { super.agregar(producto); }

    public Ticket emitirTicket() {
        return new Ticket(super.getProductos());
    }


}
