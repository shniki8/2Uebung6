package again.p1;

public class Character {
    private String name;
    private int health, damage;
    private Equipment equipment;
    private int xp = 0;

    public Character(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;

    }
    public Character(String name, int baseHealth, int baseDamage, Equipment equipment){
        //nicht null safe :)
        this(name,baseHealth + equipment.getDefenseBonus(),baseDamage + equipment.getAttackBonus());
        this.equipment = equipment;
    }

    public void defeat(Character target){
        if (target.health == 0){
            this.gainXP(50);
        }
    }

    public void gainXP(int amount){
        xp += amount;
    }

    public int getXp() {
        return xp;
    }

    public void takeDamage(int damage){
        if (damage >= health){
            health = 0;
        } else health -= damage;
    }
    public void attack(Character target){
        target.takeDamage(damage);
    }

    public void setEquipment(Equipment equipment) {
        health -= this.equipment.getDefenseBonus();
        damage -= this.equipment.getAttackBonus();
        this.equipment = equipment;
        health += equipment.getDefenseBonus();
        damage += equipment.getAttackBonus();

    }
}
