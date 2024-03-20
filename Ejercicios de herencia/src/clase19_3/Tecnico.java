package clase19_3;

public class Tecnico extends Operario{
    private int horasTrabajadas;

    public Tecnico(String nombre,int dni, int horasTrabajadas) {
        super(nombre,dni);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public String toString() {
        return super.toString() + ", horas trabajadas: " + horasTrabajadas;
    }

}
