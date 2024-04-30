package PracticaArreglos;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int posicionMaximo = -1;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > maximo) {
                maximo = numeros[i];
                posicionMaximo = i;
            }
        }

        System.out.println("El número máximo es " + maximo + " y se encuentra en la posición " + (posicionMaximo + 1) + " del arreglo.");
    }


}