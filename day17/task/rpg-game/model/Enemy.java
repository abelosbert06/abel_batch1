package model;

public class Enemy extends Character {
    public Enemy(String name, int health, int baseDamage) {
        super(name, health, baseDamage);
    }

    @Override
    public int calculateDamage() {
        return baseDamage;
    }
}