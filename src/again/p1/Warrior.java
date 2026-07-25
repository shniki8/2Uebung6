package again.p1;

public class Warrior extends Character{
    private int armor;

    public Warrior(String name, int health, int damage, int armor, Equipment equipment){
        super(name, health, damage);
        this.armor = armor;
        this.setEquipment(equipment);
    }

    @Override
    public void takeDamage(int damage) {
        if (damage > armor){
            super.takeDamage(damage-armor);
        }else System.out.println("Damage fully blocked!");
    }
}
