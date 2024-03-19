package Punto2;

class Animal {
    public String nombre ;
    public int edad ;
    public String genero;
    //constructor
    public Animal(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void Informacion(){

        System.out.println(nombre+edad+genero);

    }
   public void hacer_sonido(){
        System.out.println( "El animal hace un ruido generico");
    }
}
class perro extends Animal{
    String raza ;
    public perro(String nombre, int edad, String genero,String raza){
        super(nombre,edad,genero);
        this.raza=raza;
    }

    public void Informacion(){
        System.out.println("mi animal se llama "+nombre+" tiene "+edad+" años  y es: "+genero+" y de raza: "+raza);
    }
    public void hacer_sonido() {
        System.out.println("el perro ladra");
    }
}

class gato extends Animal{
    String color ;
    public gato(String nombre, int edad, String genero,String color){
        super(nombre,edad,genero);
        this.color=color;
    }
    public void Informacion(){
        System.out.println("mi animal se llama "+nombre+" tiene "+edad+" años  y es: "+genero+" y de color: "+color);
    }
    public void hacer_sonido() {
        System.out.println("el gato maulla");
    }
}

class pajaro extends Animal{
    String especie ;
    public pajaro(String nombre, int edad, String genero,String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }
    public void Informacion(){
        System.out.println("mi animal se llama "+nombre+" tiene "+edad+" años  y es: "+genero+" y de la especie: "+especie);
    }
    public void hacer_sonido() {
        System.out.println("la paloma arrulla");
    }

}