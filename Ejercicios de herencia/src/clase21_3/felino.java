package clase21_3;

public class felino extends animal {

    public felino(String foto, String comida, String localizacion, String tamaño) {
        super(foto, comida, localizacion, tamaño);
    }

    @Override
    public void rugir(){
        System.out.println("Rugido de felino.");

    }

}
