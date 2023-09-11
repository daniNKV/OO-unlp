package unlp.ar.oo.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public interface ListadoProductos {
    List<Producto> getProductos();
    int getCantidad();
    void agregar(Producto producto);
    void vaciar();
    double getPrecioTotal();
    double getPesoTotal();

}
