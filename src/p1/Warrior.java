package p1;

public class Warrior extends Character{
    private int armor;
    public Warrior(String name, int health, int damage, int armor, Equipment equipment){
        super(name,health,damage,equipment);
        this.armor = armor;
    }
    @Override
    public void takeDamage(int damage){
        if (damage <= armor){
            //Do nothing
        }
        else {
            super.takeDamage(damage-armor);
        }
    }
}
