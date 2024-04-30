package Ej1;

import java.util.ArrayList;
import java.util.List;
class Asignatura {
    private int aula;
    private String hora;
    private String nombre;

    public Asignatura(int aula, String hora, String nombre) {
        this.aula = aula;
        this.hora = hora;
        this.nombre = nombre;
    }

    public int getAula() {
        return aula;
    }

    public String getHora() {
        return hora;
    }

    public String getNombre() {
        return nombre;
    }
}