package Ej1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación de objetos
        Profesor profesorMatematicas = new Profesor(123456789, "Juan Pérez", "Matemáticas");
        Profesor profesorFisica = new Profesor(987654321, "Ana García", "Física");
        Alumno alumno1 = new Alumno(111111111, "Carlos Ruiz", 'A');
        Alumno alumno2 = new Alumno(222222222, "Laura González", 'A');
        Alumno alumno3 = new Alumno(333333333, "Pedro Martinez", 'B');
        Alumno alumno4 = new Alumno(444444444, "María López", 'B');
        Asignatura asignaturaMatematicas = new Asignatura(101, "08:00", "Matemáticas");
        Asignatura asignaturaFisica = new Asignatura(102, "10:00", "Física");
        Grupo grupoA = new Grupo('A');
        Grupo grupoB = new Grupo('B');
        grupoA.agregarAlumno(alumno1);
        grupoA.agregarAlumno(alumno2);
        grupoB.agregarAlumno(alumno3);
        grupoB.agregarAlumno(alumno4);

        // Asignación de asignaturas a profesores
        profesorMatematicas.agregarAsignaturaImpartida(asignaturaMatematicas);
        profesorFisica.agregarAsignaturaImpartida(asignaturaFisica);

        // Operaciones
        // a. Mostrar el aula de la 3ra. asignatura para un profesor
        System.out.println("Aula de la tercera asignatura para el profesor de Matemáticas: " + profesorMatematicas.getAulaTerceraAsignatura());

        // b. Mostrar todos los nombres de las asignaturas que imparte un profesor
        System.out.println("\nAsignaturas impartidas por el profesor :"+profesorMatematicas.getNombre());
        for (String nombreAsignatura : profesorMatematicas.getNombresAsignaturasImpartidas()) {
            System.out.println(nombreAsignatura);
        }

        // c. Mostrar el nombre y dni de los alumnos del grupo que recibe la asignatura de Matemáticas
        for (Alumno alumno : grupoA.getAlumnos()) {
            System.out.println("\nAlumno que recibe Matemáticas: " + alumno.getNombre() + ", DNI: " + alumno.getDni());
        }

        // e. Mostrar todas las asignaturas recibidas por el 1er grupo al que pertenece el alumno
        for (Alumno alumno : grupoA.getAlumnos()) {
            System.out.println("\nAsignaturas recibidas por el 1er grupo al que pertenece el alumno " + alumno.getNombre() + ":");
                System.out.println(asignaturaMatematicas.getNombre());
            }


        // f. Mostrar el profesor que imparte una asignatura existente para un alumno
        for (Alumno alumno : grupoA.getAlumnos()) {
            for (Asignatura asignatura : alumno.getAsignaturasRecibidas()) {
                if (asignatura.getNombre().equals("Matemáticas")) {
                    System.out.println("\nProfesor que imparte Matemáticas para el alumno " + alumno.getNombre() + ": " + profesorMatematicas.getNombre());
                }
            }
        }
    }
}
