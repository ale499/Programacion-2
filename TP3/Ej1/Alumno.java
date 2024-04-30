package Ej1;

import java.util.ArrayList;
import java.util.List;
class Alumno extends Persona {
    private char grupo;
    private List<Asignatura> asignaturasRecibidas;

    public Alumno(int dni, String nombre, char grupo) {
        super(dni, nombre);
        this.grupo = grupo;
        this.asignaturasRecibidas = new ArrayList<>();
    }

    public char getGrupo() {
        return grupo;
    }

    public void agregarAsignaturaRecibida(Asignatura asignatura) {
        asignaturasRecibidas.add(asignatura);
    }

    public List<Asignatura> getAsignaturasRecibidas() {
        return asignaturasRecibidas;
    }

    public List<String> getNombresAsignaturasRecibidas() {
        List<String> nombresAsignaturas = new ArrayList<>();
        for (Asignatura asignatura : asignaturasRecibidas) {
            nombresAsignaturas.add(asignatura.getNombre());
        }
        return nombresAsignaturas;
    }
}