package p1;

public class Mage extends Character{
    private int mana;
    private int spellPower;
    public Mage(String name, int health, int damage, int mana, int spellPower, Equipment equipment){
        super(name,health,damage,equipment);
        this.mana = mana;
        this.spellPower = spellPower;
    }
    @Override
    public void attack(Character target){
        if (mana >= spellPower){
            mana -= spellPower;
            target.takeDamage(spellPower);
        }
        else{} //Tja wohl zu schwach nh :)
    }
    @Override
    public void gainXP(int amount){
        super.gainXP(amount+10);
    }
}
