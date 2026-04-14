package model;

public class Player extends Character {
    private Weapon equippedWeapon;
    private Item equippedItem;

    public Player(String name, int health, int baseDamage) {
        super(name, health, baseDamage);
    }

    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        System.out.println("Equipped weapon: " + weapon.getName());
    }

    public void equipItem(Item item) {
        this.equippedItem = item;
        this.health += item.getHealthBonus();
        System.out.println("Equipped item: " + item.getName() + " (Health increased by " + item.getHealthBonus() + ")");
    }

    public void increaseBaseDamage(int amount) {
        this.baseDamage += amount;
        System.out.println("Cyberware installed. Base damage permanently increased by " + amount + ".");
    }

    @Override
    public int calculateDamage() {
        return baseDamage + (equippedWeapon != null ? equippedWeapon.getDamageBonus() : 0);
    }
}