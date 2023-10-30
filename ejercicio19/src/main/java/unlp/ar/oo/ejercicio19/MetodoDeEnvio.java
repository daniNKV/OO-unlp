package unlp.ar.oo.ejercicio19;

public abstract class MetodoDeEnvio {
    private String direccionCliente;
    private String direccionVendedor;

    public void setDireccionCliente(String direccion) {
        this.direccionCliente = direccion;
    }

    public void setDireccionVendedor(String ubicacion) {
        this.direccionVendedor = ubicacion;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public String getDireccionVendedor() {
        return direccionVendedor;
    }

    abstract double calcularCostoEnvio();

}
