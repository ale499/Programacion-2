package Clase23_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operador;

        System.out.print("Ingrese el primer número: ");
        num1 = obtenerNumero(scanner);

        System.out.print("Ingrese el segundo número: ");
        num2 = obtenerNumero(scanner);

        System.out.print("Ingrese la operación deseada (+, -, *, /): ");
        operador = obtenerOperador(scanner);

        double resultado = 0;
        try {
            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operador no válido.");
                    return;
            }
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static double obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); // Limpiar el búfer del scanner
            }
        }
    }

    private static char obtenerOperador(Scanner scanner) {
        char operador;
        while (true) {
            operador = scanner.next().charAt(0);
            if (operador == '+' || operador == '-' || operador == '*' || operador == '/') {
                return operador;
            } else {
                System.out.println("Operador no válido. Ingrese uno de los siguientes: +, -, *, /");
            }
        }
    }
}
