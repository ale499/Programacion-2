package PracticaArreglos;

public class EJ3 {
    public static void main(String[] args) {
        int[] primos = new int[10];
        int contadorPrimos = 0;

        for (int numero = 100; numero <= 300; numero++) {
            if (esPrimo(numero)) {
                primos[contadorPrimos] = numero;
                contadorPrimos++;
                if (contadorPrimos == 10) {
                    break;
                }
            }
        }

        System.out.println("Los 10 números primos comprendidos entre 100 y 300 son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
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
