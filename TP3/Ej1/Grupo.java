package Ej1;

import java.util.*;

class Grupo {
    private char nombre;
    private List<Alumno> alumnos;
    private List<Asignatura> asignaturas;

    public Grupo(char nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    public char getNombre() {
        return nombre;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        asignarAsignaturasAAlumno(alumno); // Llamada al método para asignar las asignaturas al alumno
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
        asignarAsignaturasAAlumnos(); // Llamada al método para asignar todas las asignaturas a todos los alumnos
    }

    private void asignarAsignaturasAAlumno(Alumno alumno) {
        for (Asignatura asignatura : asignaturas) {
            alumno.agregarAsignaturaRecibida(asignatura);
        }
    }

    private void asignarAsignaturasAAlumnos() {
        for (Alumno alumno : alumnos) {
            for (Asignatura asignatura : asignaturas) {
                alumno.agregarAsignaturaRecibida(asignatura);
            }
        }
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}