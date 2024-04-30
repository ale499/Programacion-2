package Clase16_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team implements Iterable <Player>{
    private List<Player> players;

    public Team() {
        players = new ArrayList<>();
    }
    public void AddPlayer(Player jugador) {
        players.add(jugador);
    }


    @Override
    public Iterator<Player> iterator(){
        return new TeamIterator();
    }
    private class TeamIterator implements Iterator<Player> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < players.size();
        }

        @Override
        public Player next() {
            return players.get(index++);
        }
    }
}

