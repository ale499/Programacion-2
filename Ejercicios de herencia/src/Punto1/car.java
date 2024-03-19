package Punto1;

public class car extends vehicle{
    private int speed;
    private int cylinders;


    public car(String color, int wheels, int speed, int cylinders) {
        super(color, wheels);
        this.speed = speed;
        this.cylinders = cylinders;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

}
