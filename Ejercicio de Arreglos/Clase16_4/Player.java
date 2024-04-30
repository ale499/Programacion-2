package Clase16_4;

public class Player {
    private String name;
    private String position;
    private int JNumber;

    public Player(String name, String position, int JNumber) {
        this.name = name;
        this.position = position;
        this.JNumber = JNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJNumber() {
        return JNumber;
    }

    public void setJNumber(int JNumber) {
        this.JNumber = JNumber;
    }
}
