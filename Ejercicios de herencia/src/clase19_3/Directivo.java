package clase19_3;

public class Directivo extends Empleado{

    private String departamento;


    public Directivo(String nombre, String departamento){
        super(nombre);
        this.departamento = departamento;

    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "El directivo es: " + getNombre() + ", departamento: " + departamento;
    }

}
