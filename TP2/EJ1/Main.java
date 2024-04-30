package EJ1;

public class Main {
    public static void main(String[] args) {

        TiendaDeMascotas tienda = new TiendaDeMascotas();

        Perro perro = new Perro("bobi",7,"perro",12.50,"ovejero aleman",false);

        Gato gato = new Gato("blanquito",3,"gato",15.50,"persa",true);

        Ave ave = new Ave("rex",2,"pajaro",20.5,"cacatua",true);

        Pez pez = new Pez("burbujas",1,"pez",7.5,"naranja","chica");

        tienda.addAnimal(perro);
        tienda.addAnimal(gato);
        tienda.addAnimal(ave);
        tienda.addAnimal(pez);

        tienda.listarAnimales();

        System.out.println("--------- Venta de animales ----------");

        tienda.venderAnimal("bobi");

        System.out.println("--------- Alimentacion de animales -------");

        tienda.alimentarAnimal("blanquito");

        System.out.println("---------- Presentacion del animal--------");

        System.out.println(perro.toString());


        }

}
