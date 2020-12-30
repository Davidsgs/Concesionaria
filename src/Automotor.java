public class Automotor extends Vehiculos {
    private int cantPuertas;

    public Automotor(String marca, String modelo, String precio, int cantPuertas) {
        super(marca, modelo, precio);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    @Override
    public String caracteristicas() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() +
                " // Puertas: " + getCantPuertas() + " // Precio: " + getPrecio();
    }
}