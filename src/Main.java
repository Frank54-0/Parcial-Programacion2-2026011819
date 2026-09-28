public class Main {
    public static void main(String[] args) {
        Empleado vendedor = new Vendedor("Franklin Martín", 1000);
        vendedor.cambiarEstrategia(new ComisionPersonalizada("Franklin"));
        vendedor.mostrarDetalle();
    }
}