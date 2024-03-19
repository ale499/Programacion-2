package Punto1;

public class van extends car{
      private int carga;

    public van(String color, int wheels, int speed, int cylinders, int carga) {
        super(color, wheels, speed, cylinders);
        this.carga = carga;
    }


    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    @Override
    public String toString() {
        return "Furgoneta: " + super.toString() + ", Carga: " + carga;
    }

}
