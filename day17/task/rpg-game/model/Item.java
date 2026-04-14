package model;

public class Item {
    private String name;
    private int healthBonus;

    public Item(String name, int healthBonus) {
        this.name = name;
        this.healthBonus = healthBonus;
    }

    public String getName() {
        return name;
    }

    public int getHealthBonus() {
        return healthBonus;
    }
}