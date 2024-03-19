package Punto1;

public class motorcycle extends bicycle{

    private int speedKm;
    private int cc;

    public motorcycle(String color, int wheels, String tipo, int speedKm, int cc) {
        super(color, wheels, tipo);
        this.speedKm = speedKm;
        this.cc = cc;
    }

    public int getSpeedKm() {
        return speedKm;
    }

    public void setSpeedKm(int speedKm) {
        this.speedKm = speedKm;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
