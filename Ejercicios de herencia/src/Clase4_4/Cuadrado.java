package Clase4_4;

public class Cuadrado implements Figura,Rotable,Dibujable{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public void rotar(int grados) {
        System.out.println("Rotando el cuadrado " + grados + " grados.");

    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado de " + lado + " lados");

    }
}
