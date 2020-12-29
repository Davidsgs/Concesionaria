public class Motovehiculo extends Vehiculos {
    private int cilindrada;

    public Motovehiculo(String marca, String modelo, String precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String caracteristicas() {
        return "Marca: " + getMarca() + "// Modelo: " + getModelo() +
                "// Cilindrada: " + getCilindrada() + "cc // Precio: $" + getPrecio();
    }
}