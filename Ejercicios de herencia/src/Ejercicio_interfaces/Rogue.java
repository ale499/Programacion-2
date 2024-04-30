package Ejercicio_interfaces;

public class Rogue extends Base_Character {
    public Rogue(String name, int level, int lifePoint) {
        super(name, level, lifePoint);
    }

    @Override
    public int Attack() {
        return 15;
    }

    @Override
    public void Defend(int damage) {
        // el Pícaro tiene una habilidad especial de evasión, Tiene un 50% de probabilidad de evitar completamente el daño recibido
        if (Math.random() < 0.5) {
            System.out.println("¡El Pícaro ha evadido el ataque!");

        } else {
            super.Defend(damage);
        }
    }
}



