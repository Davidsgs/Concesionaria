import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Vehiculos {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculos(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public String getPrecioString() {
        return String.valueOf(precio);
    }

    public abstract String caracteristicas();
}

