package clase19_3;

public class Oficial extends Operario{
    private int edad;


    public Oficial(String nombre, int dni, int edad) {
        super(nombre, dni);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString() + ", edad: " + edad;
    }

}
