package PracticaArreglos;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        int contadorRepetido = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == mayor) {
                contadorRepetido++;
            }
        }

        System.out.println("El mayor número ingresado es: " + mayor);
        System.out.println("Se repite " + contadorRepetido + " veces.");
    }
}
