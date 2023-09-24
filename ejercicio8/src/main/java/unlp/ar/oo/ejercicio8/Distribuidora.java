package unlp.ar.oo.ejercicio8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Distribuidora {
    Double precioKWh;
    Set<Usuario> usuarios;

    public Distribuidora() {
        this.usuarios = new HashSet<>();
    }
    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    public void setPrecioKWh(Double precioKWh) { this.precioKWh = precioKWh; }
    public Double getPrecioKWh() { return precioKWh; }

    public int cantidadUsuarios() {
        return usuarios.size();
    }

    public List<Factura> facturar() {
        return this.usuarios.stream()
                .map(usuario -> usuario.facturarEnBaseA(this.getPrecioKWh()))
                .toList();
    }

    public Double consumoTotalActiva() {
        return this.usuarios.stream()
                .mapToDouble(Usuario::ultimoConsumoActiva)
                .sum();
    }

}
