package Ej1;

import java.util.ArrayList;
import java.util.List;
class Profesor extends Persona {
    private String departamento;
    private List<Asignatura> asignaturasImpartidas;

    public Profesor(int dni, String nombre, String departamento) {
        super(dni, nombre);
        this.departamento = departamento;
        this.asignaturasImpartidas = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void agregarAsignaturaImpartida(Asignatura asignatura) {
        asignaturasImpartidas.add(asignatura);
    }

    public List<String> getNombresAsignaturasImpartidas() {
        List<String> nombresAsignaturas = new ArrayList<>();
        for (Asignatura asignatura : asignaturasImpartidas) {
            nombresAsignaturas.add(asignatura.getNombre());
        }
        return nombresAsignaturas;
    }

    public String getAulaTerceraAsignatura() {
        if (asignaturasImpartidas.size() >= 3) {
            return String.valueOf(asignaturasImpartidas.get(2).getAula());
        }
        return "No hay tercera asignatura";
    }
}