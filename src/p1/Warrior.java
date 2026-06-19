package p1;

public class Warrior extends Character{
    private int armor;
    private boolean b = false;
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
    @Override
    public void gainXP(int amount){
        super.gainXP(amount);
        //Aufgabe missverständlich formuliert, soll das nur 1 Mal insgesamt passieren oder alle 100 xp???
        //Falls letzteres, eine setXP Methode scheint nicht erlaubt aber sonst ist der Zugriff nicht möglich?
        //Habs jetzt nur 1 Mal gemacht :/
        if (super.getXp()>= 100 && b){
            armor++;
            b = !b;
        }
    }
}
