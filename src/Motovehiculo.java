public class Motovehiculo extends Vehiculos {
    private int cilindrada;

    public Motovehiculo(String marca, String modelo, float precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCilindradaString() {
        return String.valueOf(cilindrada);
    }

    @Override
    public String caracteristicas() {
        return "Marca: " + getMarca() + "// Modelo: " + getModelo() +
                "// Puertas: " + getCilindradaString() + "// Precio: " + getPrecioString() + "";
    }
}