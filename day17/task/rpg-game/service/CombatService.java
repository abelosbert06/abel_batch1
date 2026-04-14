package service;

import model.Player;
import model.Enemy;
import util.InputUtils;

public class CombatService {
    public boolean initiateCombat(Player player, Enemy enemy) {
        System.out.println("\nCOMBAT STARTED: " + player.getName() + " VS " + enemy.getName() + " ");
        
        if (!player.isAlive()) {
            System.out.println("You have flatlined.");
            return false;
        }

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\n1. Attack\n2. Brace (Reduce incoming damage by half, 50% chance to counter-attack)");
            int choice = InputUtils.getInt();

            int playerDamage = player.calculateDamage();
            boolean isBracing = false;

            if (choice == 1) {
                enemy.takeDamage(playerDamage);
                System.out.println("You hit " + enemy.getName() + " for " + playerDamage + " damage.");
            } else if (choice == 2) {
                isBracing = true;
                System.out.println("You brace for impact.");
                if (Math.random() < 0.5) {
                    enemy.takeDamage(playerDamage);
                    System.out.println("Counter-attack successful! You hit " + enemy.getName() + " for " + playerDamage + " damage.");
                }
            }

            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " is defeated!");
                return true;
            }

            int enemyDamage = enemy.calculateDamage();
            if (isBracing) {
                enemyDamage /= 2;
            }

            player.takeDamage(enemyDamage);
            System.out.println(enemy.getName() + " hits you for " + enemyDamage + " damage.");
            System.out.println("Your Health: " + player.getHealth() + " | Enemy Health: " + enemy.getHealth());

            if (!player.isAlive()) {
                System.out.println("You have flatlined.");
                return false;
            }
        }
        return player.isAlive();
    }
}