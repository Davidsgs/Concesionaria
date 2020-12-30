import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Vehiculos> listaDeVehiculos = Arrays.asList(
                new Automotor("Peugeot","206","200.000,00",4),
                new Motovehiculo("Honda","Titan","60.000,00",125),
                new Automotor("Peugeot","208","250.000,00",5),
                new Motovehiculo("Yamaha","YBR","80.500,50",160)
        );

        listaDeVehiculos.forEach( vehiculo -> {
            System.out.println(vehiculo.caracteristicas());
        });

        System.out.println("=============================");

        Vehiculos elMasCaro = listaDeVehiculos.stream().max(Comparator.comparingDouble(Vehiculos::getPrecioDouble))
                .get();

        System.out.println("Vehículo más caro: " + elMasCaro);

        Vehiculos elMasBarato = listaDeVehiculos.stream().min(Comparator.comparingDouble(Vehiculos::getPrecioDouble))
                .get();

        System.out.println("Vehículo más barato: " + elMasBarato);

        Vehiculos queContieneLetraY = listaDeVehiculos.stream()
                .filter( v -> v.getMarca().contains("Y")).findFirst().get();

        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + queContieneLetraY + " " + queContieneLetraY.getPrecio());

        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        listaDeVehiculos.stream().sorted(Comparator.comparingDouble(Vehiculos::getPrecioDouble).reversed()).forEach(System.out::println);
    }

}
