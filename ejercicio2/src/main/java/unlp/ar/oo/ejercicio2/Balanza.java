package unlp.ar.oo.ejercicio2;

public class Balanza extends ListadoProductos {
    public Balanza() { super(); }

    public void ponerEnCero() { super.vaciarProductos(); }

    public Ticket emitirTicket() {
        return new Ticket(super.getProductos());
    }


}
