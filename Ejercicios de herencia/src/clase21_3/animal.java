package clase21_3;

public abstract class animal {
    private String foto;
    private String comida;
    private String localizacion;
    private String tamaño;

    public animal(String foto, String comida, String localizacion, String tamaño) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamaño = tamaño;
    }

    public  void hacerRuido(){

    }
    public void comer() {
        System.out.println("Este animal está comiendo " + comida);
    }
    public void dormir() {
        System.out.println("Este animal está durmiendo.");
    }
    public  void rugir(){

    }


    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

}
