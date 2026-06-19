package p1;

public class Character {
    private String name;
    private int health;
    private int damage;
    private Equipment equipment;
    private int xp;
    public Character(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
        xp = 0;
    }
    public Character(String name, int baseHealth, int baseDamage, Equipment equipment){
        this.name = name;
        this.equipment = equipment;
        this.health = baseHealth+this.equipment.getDefenseBonus();
        this.damage = baseDamage+this.equipment.getAttackBonus();
        xp = 0;
    }
    public void takeDamage(int damage){
        if (health-damage<= 0){
            health = 0;
        }
        else health-=damage;
    }
    public void attack(Character target){
        target.takeDamage(this.damage);
    }
    public void setEquipment(Equipment neu){
        health = health - equipment.getDefenseBonus() + neu.getDefenseBonus();
        damage = damage - equipment.getDefenseBonus() + neu.getAttackBonus();
        equipment = neu;
        if (health<0){
            health = 0;
        }

    }
    public void gainXP(int amount){
        xp+= amount;
    }
    public int getXp() {
        return xp;
    }
    public void defeat(Character target){
        if (target.health == 0){
            gainXP(50);
        }
    }
}
