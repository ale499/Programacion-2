package PracticaArreglos;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números terminados en 4 se encuentran en las siguientes posiciones:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 10 == 4) {
                System.out.println("Posición " + (i + 1));
            }
        }
    }
}
