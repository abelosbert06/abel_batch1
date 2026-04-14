package service;

import model.Player;
import util.InputUtils;

public class GameEngine {
    public void start() {
        System.out.println("Enter character name (V): ");
        String name = InputUtils.getString();
        
        System.out.println("Select your Lifepath:\n1. Nomad (High Health)\n2. Streetkid (High Damage)\n3. Corpo (Balanced)");
        int lifepath = InputUtils.getInt();
        
        int baseHealth = 100;
        int baseDamage = 10;
        
        if (lifepath == 1) {
            baseHealth = 130;
        } else if (lifepath == 2) {
            baseDamage = 18;
        } else if (lifepath == 3) {
            baseHealth = 115;
            baseDamage = 14;
        }
        
        Player player = new Player(name, baseHealth, baseDamage);
        System.out.println("\nCharacter created: " + player.getName() + " | HP: " + player.getHealth() + " | DMG: " + player.calculateDamage());
        
        MissionService missionService = new MissionService();
        missionService.startStory(player);
    }
}