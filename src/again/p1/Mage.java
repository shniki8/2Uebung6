package again.p1;

public class Mage extends Character{
    private int mana, spellpower;
    public Mage(String name, int health, int damage, int mana, int spellPower, Equipment equipment){
        super(name,health,damage);
        this.mana = mana;
        this.spellpower = spellPower;
        this.setEquipment(equipment);
    }

    @Override
    public void gainXP(int amount) {
        super.gainXP(amount+10);

    }

    @Override
    public void attack(Character target) {
        if (mana >= spellpower){
            super.attack(target);
            mana -= spellpower;
        }else{
            System.out.println("Not enough mana!");
        }
    }
}
