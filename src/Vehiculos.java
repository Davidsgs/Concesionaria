import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Vehiculos {
    private String marca;
    private String modelo;
    private String precio;
    private double precioDouble;

    public Vehiculos(String marca, String modelo, String precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.precioDouble = transformarPrecioADouble(precio);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public double getPrecioDouble() {
        return precioDouble;
    }

    public double transformarPrecioADouble(String unPrecioString){
        String parteEntera = unPrecioString.substring(0, unPrecioString.indexOf(','));
        parteEntera = parteEntera.replace(".","");
        String parteDecimal = unPrecioString.substring(unPrecioString.indexOf(',') + 1, unPrecioString.length() - 1);
        return Double.parseDouble(parteEntera) + (Double.parseDouble(parteDecimal) / 10);
    }

    public abstract String caracteristicas();

    @Override
    public String toString(){
        return getMarca() + " " + getModelo();
    }

}

