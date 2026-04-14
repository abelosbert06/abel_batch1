package model;

public class Weapon {
    private String name;
    private int damageBonus;

    public Weapon(String name, int damageBonus) {
        this.name = name;
        this.damageBonus = damageBonus;
    }

    public String getName() {
        return name;
    }

    public int getDamageBonus() {
        return damageBonus;
    }
}