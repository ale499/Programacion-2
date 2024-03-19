package Punto1;

public class bicycle extends vehicle{
    private String tipo;


    public bicycle(String color, int wheels, String tipo) {
        super(color, wheels);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Bicicleta: " + super.toString() + ", Tipo: " + tipo;
    }
}
