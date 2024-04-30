package Clase16_4;

public class Main {
    public static void main(String[] args) {
        // Creación de jugadores
        Player jugador1 = new Player("Messi", "Delantero", 10);
        Player jugador2 = new Player("Ronaldo", "Delantero", 7);
        Player jugador3 = new Player("Modric", "Centrocampista", 10);

        // Creación del equipo
        Team equipo = new Team();
        equipo.AddPlayer(jugador1);
        equipo.AddPlayer(jugador2);
        equipo.AddPlayer(jugador3);

        // Iteración sobre los jugadores del equipo utilizando un bucle for-each
        System.out.println("Jugadores del equipo:");
        for (Player jugador : equipo) {
            System.out.println("Nombre: " + jugador.getName() + ", Posición: " + jugador.getPosition() + ", Número de camiseta: " + jugador.getJNumber());
        }
    }
}
