package PracticaArreglos;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int mayorPrimo = Integer.MIN_VALUE;
        int posicionMayorPrimo = -1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (esPrimo(numeros[i]) && numeros[i] > mayorPrimo) {
                mayorPrimo = numeros[i];
                posicionMayorPrimo = i;
            }
        }

        if (posicionMayorPrimo != -1) {
            System.out.println("El mayor número primo es " + mayorPrimo + " y se encuentra en la posición " + (posicionMayorPrimo + 1) + " del arreglo.");
        } else {
            System.out.println("No se encontró ningún número primo en el arreglo.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
