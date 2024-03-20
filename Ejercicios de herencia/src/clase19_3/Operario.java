package clase19_3;

public class Operario extends Empleado{

    private int dni;

    public Operario(String nombre, int dni) {
        super(nombre);
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        String s = super.toString() + "dni: " + dni;
        return s;
    }
}
