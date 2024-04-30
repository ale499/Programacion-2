package Clase4_4;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        Circulo circulo1 = new Circulo(8);

        System.out.println("El area del cuadrado es = "+cuadrado1.area());
        cuadrado1.rotar(90);
        cuadrado1.dibujar();
        circulo1.dibujar();
        
    }
}