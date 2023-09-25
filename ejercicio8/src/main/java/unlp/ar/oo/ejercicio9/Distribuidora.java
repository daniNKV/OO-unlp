package unlp.ar.oo.ejercicio9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Distribuidora {
    double precioKWh;
    Set<Usuario> usuarios;


    public Distribuidora() {
        this.usuarios = new HashSet<>();
    }
    public Distribuidora(double precioKWh) {
        this();
        this.precioKWh = precioKWh;
    }
    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    public void setPrecioKWh(Double precioKWh) { this.precioKWh = precioKWh; }
    public double getPrecioKW() { return precioKWh; }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public int cantidadUsuarios() {
        return usuarios.size();
    }
    public List<Factura> facturar() {
        return this.usuarios.stream()
                .map(usuario -> usuario.facturarEnBaseA(this.getPrecioKW()))
                .toList();
    }
    public Double consumoTotalActiva() {
        return this.usuarios.stream()
                .mapToDouble(Usuario::ultimoConsumoActiva)
                .sum();
    }

}
