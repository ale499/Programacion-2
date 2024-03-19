package Punto1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<vehicle> vehiculos = new ArrayList<>();
        vehiculos.add(new car("rosa", 4, 140, 1200));
        vehiculos.add(new van("negro", 4, 120, 1500, 785));
        vehiculos.add(new bicycle("gris", 2, "urbana"));
        vehiculos.add(new motorcycle("rojo", 2, "deportiva", 170, 500));

        catalogar(2, vehiculos);
    }

    public static void catalogar(int ruedas, List<vehicle> vehiculos) {
        if (ruedas <= 0) {
            System.out.println("El número de ruedas debe ser mayor que cero.");
            return;
        }

        int count = 0;
        System.out.println("Se han encontrado vehículos con " + ruedas + " ruedas:");
        for (vehicle vehiculo : vehiculos) {
            if (vehiculo.getWheels() == ruedas) {
                System.out.println(vehiculo);
                count++;
            }
        }
        System.out.println("Se han encontrado " + count + " vehículos con " + ruedas + " ruedas.");
    }
}