package unlp.ar.oo.ejercicio19;

public class RetiroEnCorreo extends MetodoDeEnvio {
    private double costo;
    private String direccionCliente;
    private String direccionVendedor;
    public RetiroEnCorreo(double costoRetiroEnCorreo) {
        this.costo = costoRetiroEnCorreo;
    }
    public RetiroEnCorreo() {
        this.costo = 50.0;
    }
    @Override
    public double calcularCostoEnvio() {
        return costo;
    }

}
