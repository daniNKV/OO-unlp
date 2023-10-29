package unlp.ar.oo.ejercicio17;

public class ReciboDeSueldo {
    private String nombre;
    private String apellido;
    private Integer cuil;
    private Integer antiguedad;
    private double montoACobrar;

    public ReciboDeSueldo(String nombre, String apellido, Integer cuil, Integer antiguedad, double montoACobrar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.antiguedad = antiguedad;
        this.montoACobrar = montoACobrar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCuil() {
        return cuil;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public double getMontoACobrar() {
        return montoACobrar;
    }
}
