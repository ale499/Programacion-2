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
                System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
                System.out.println("Color: " + vehiculo.getColor());
                System.out.println("Número de ruedas: " + vehiculo.getWheels());
                if (vehiculo instanceof car) {
                    car coche = (car) vehiculo;
                    System.out.println("Velocidad máxima: " + coche.getSpeed());
                } else if (vehiculo instanceof van) {
                    van furgoneta = (van) vehiculo;
                    System.out.println("Velocidad máxima: " + furgoneta.getSpeed());
                    System.out.println("Peso: " + furgoneta.getCarga());
                } else if (vehiculo instanceof bicycle) {
                    bicycle bicicleta = (bicycle) vehiculo;
                    System.out.println("Tipo: " + bicicleta.getTipo());
                } else if (vehiculo instanceof motorcycle) {
                    motorcycle moto = (motorcycle) vehiculo;
                    System.out.println("Tipo: " + moto.getTipo());
                    System.out.println("Velocidad máxima: " + moto.getSpeedKm());
                }
                System.out.println();
                count++;
            }
        }
        System.out.println("Se han encontrado " + count + " vehículos con " + ruedas + " ruedas.");
    }
}