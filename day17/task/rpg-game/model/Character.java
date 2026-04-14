package model;

public abstract class Character {
    protected String name;
    protected int health;
    protected int baseDamage;

    public Character(String name, int health, int baseDamage) {
        this.name = name;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract int calculateDamage();

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}