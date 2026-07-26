package again.p1;

public class Warrior extends Character{
    private int armor;
    private int counter;

    public Warrior(String name, int health, int damage, int armor, Equipment equipment){
        super(name, health, damage);
        this.armor = armor;
        this.setEquipment(equipment);
    }

    @Override
    public void gainXP(int amount) {
        super.gainXP(amount);
        counter += amount;
        if (super.getXp()>= 100 && counter >= 100){
            armor++;
            counter -= 100;
        }

    }

    @Override
    public void takeDamage(int damage) {
        if (damage > armor){
            super.takeDamage(damage-armor);
        }else System.out.println("Damage fully blocked!");
    }
}
