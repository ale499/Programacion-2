package Punto1;

import org.w3c.dom.ls.LSOutput;

public class vehicle {
    private String color;
    private int wheels;

    public vehicle(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }


}





