public class ComisionPersonalizada implements EstrategiaComision {
    private final String primerNombre;

    public ComisionPersonalizada(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Override
    public double calcularComision(double montoVenta) {
        int n = primerNombre.trim().length();
        double porcentaje = 5 + n;
        return montoVenta * porcentaje / 100;
    }
}