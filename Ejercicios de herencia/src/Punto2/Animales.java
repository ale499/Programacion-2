package Punto2;

public class Animales {


    public static void main(String[] args) {

        //Atributos: nombre, edad, género
        //constructor init
        //Metodos: hacer_sonido(): Este método imprimirá "El animal hace un sonido genérico."

        /*  a. Agrega atributos adicionales que sean específicos para cada tipo de animal,
                como "raza" para el perro o "especie" para el pájaro.
                b. Define el método hacer_sonido() para cada clase derivada de manera que
        imprima un sonido característico del animal (por ejemplo, "El perro ladra" para
        la clase "Perro").
        c. Crea un método adicional llamado informacion() que imprimirá la información
        sobre el animal, incluyendo los atributos específicos del tipo de animal.
    */


        Animal Animal = new Animal("jose",22,"masculino");

        Animal per = new perro("pepe",4,"masculino","doberman");

        Animal gat = new gato("negrita",2,"femenino","negro");

        Animal paj = new pajaro("palo",3,"femenino","paloma bravia");

        per.Informacion();
        per.hacer_sonido();

        gat.Informacion();
        gat.hacer_sonido();

        paj.Informacion();
        paj.hacer_sonido();

    }
}
