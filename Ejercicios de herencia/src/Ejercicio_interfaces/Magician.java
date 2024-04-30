package Ejercicio_interfaces;

public class Magician extends Base_Character{
    public Magician(String name, int level, int lifePoint) {
        super(name, level, lifePoint);
    }

    @Override
    public int Attack() {
        return 20;
    }
    @Override
    public void Defend(int damage){
        //El mago tiene una menor resistencia al daño,reduce el daño recibido en un 20%
        super.Defend((int) (damage * 0.8));
    }
}
