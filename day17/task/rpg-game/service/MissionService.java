package service;

import model.Player;
import model.Enemy;
import model.Weapon;
import model.Item;
import util.InputUtils;

public class MissionService {
    private CombatService combatService;

    public MissionService() {
        this.combatService = new CombatService();
    }

    public void startStory(Player player) {
        missionOne(player);
        if (!player.isAlive()) return;
        
        missionTwo(player);
        if (!player.isAlive()) return;
        
        missionThree(player);
        if (!player.isAlive()) return;
        
        missionFour(player);
        if (!player.isAlive()) return;
        
        missionFive(player);
        if (!player.isAlive()) return;
        
        missionSix(player);
        
        if (player.isAlive()) {
            System.out.println("\n[EPILOGUE]");
            InputUtils.waitForEnter();
            System.out.println("You wake up in a landfill, rain pouring down. A man with a silver cyberarm stands over you.");
            InputUtils.waitForEnter();
            System.out.println("Johnny Silverhand: Wake up, Samurai. We have a city to burn.");
            InputUtils.waitForEnter();
            System.out.println("\nPROLOGUE COMPLETED. WELCOME TO NIGHT CITY.");
        }
    }

    private void missionOne(Player player) {
        System.out.println("\nMISSION 1: THE RESCUE ");
        InputUtils.waitForEnter();
        System.out.println("Jackie Welles: Alright V, we're looking for a girl named Sandra Dorsett.");
        InputUtils.waitForEnter();
        System.out.println("Jackie Welles: Scavs grabbed her. They're probably stripping her for cyberware right now.");
        InputUtils.waitForEnter();
        System.out.println("Jackie Welles: We breach the door, we don't know what's on the other side. How do you wanna play this?");
        
        System.out.println("\n1. [Go in loud] Kick the door down and blast everyone.");
        System.out.println("2. [Stealth] Hack the door optics and ambush them quietly.");
        
        int choice = InputUtils.getInt();
        Enemy scav = new Enemy("Scavenger Boss", 50, 10);
        
        if (choice == 2) {
            System.out.println("\nYou hack the door. You slip in while they are distracted by a ripperdoc table.");
            InputUtils.waitForEnter();
            System.out.println("You get the drop on the boss and land a critical stealth strike!");
            scav.takeDamage(25);
            System.out.println("Scavenger Boss takes 25 stealth damage.");
        } else {
            System.out.println("\nYou kick the door open. Scavs scatter and draw their iron. Firefight breaks out!");
        }
        
        InputUtils.waitForEnter();
        combatService.initiateCombat(player, scav);
        
        if (player.isAlive()) {
            System.out.println("\nJackie Welles: Area secure. Found her, V. Trauma Team is on the way. Good work.");
            InputUtils.waitForEnter();
        }
    }

    private void missionTwo(Player player) {
        System.out.println("\nMISSION 2: THE RIPPERDOC ");
        InputUtils.waitForEnter();
        System.out.println("Viktor Vector: V! Sit down. Jackie tells me you're moving up in the world.");
        InputUtils.waitForEnter();
        System.out.println("Viktor Vector: You got a meeting with Dexter DeShawn. You need better chrome if you're working with the big leagues.");
        InputUtils.waitForEnter();
        System.out.println("Viktor Vector: I can install the Kiroshi Optics Mk.1 for better threat detection, or a Ballistic Coprocessor to make you hit harder. Your choice.");
        
        System.out.println("\n1. Install Kiroshi Optics (+30 Health).");
        System.out.println("2. Install Ballistic Coprocessor (+10 Base Damage).");
        
        int choice = InputUtils.getInt();
        if (choice == 1) {
            System.out.println("\nViktor Vector: The Kiroshi is a classic. You'll see things before they even happen.");
            player.equipItem(new Item("Kiroshi Optics Mk.1", 30));
        } else {
            System.out.println("\nViktor Vector: Coprocessor it is. Your smart-link syncs directly with your nervous system now.");
            player.increaseBaseDamage(10);
        }
        InputUtils.waitForEnter();
    }

    private void missionThree(Player player) {
        System.out.println("\nMISSION 3: THE RIDE ");
        InputUtils.waitForEnter();
        System.out.println("You step into a heavy armored luxury car. The air smells like synthetic leather and expensive cigars.");
        InputUtils.waitForEnter();
        System.out.println("Dexter DeShawn: V. The mercenary of the hour. Have a seat.");
        InputUtils.waitForEnter();
        System.out.println("Dexter DeShawn: I have a highly lucrative job. We are stealing a piece of prototype tech from Arasaka.");
        InputUtils.waitForEnter();
        System.out.println("Dexter DeShawn: The 'Relic'. A biochip that supposedly stores human engrams. Before we hit Konpeki Plaza, you need to get a Flathead drone from the Maelstrom gang.");
        InputUtils.waitForEnter();
        System.out.println("Dexter DeShawn: Before you step into the fire, what drives you, V? The quiet life, or going down in a blaze of glory?");
        
        System.out.println("\n1. Quiet life. I just want to survive and get paid.");
        System.out.println("2. Blaze of glory. I want to be a Night City legend.");
        InputUtils.getInt();
        
        System.out.println("\nDexter DeShawn: Interesting. Either way, you'll need this. Standard issue, but reliable.");
        player.equipWeapon(new Weapon("Militech Lexington Pistol", 25));
        InputUtils.waitForEnter();
    }

    private void missionFour(Player player) {
        System.out.println("\nMISSION 4: THE PICKUP ");
        InputUtils.waitForEnter();
        System.out.println("You walk into the All Foods factory. Red lasers sweep the room. Heavy metal blasts through the speakers.");
        InputUtils.waitForEnter();
        System.out.println("Royce, the Maelstrom boss, presses a heavy pistol directly against your forehead.");
        InputUtils.waitForEnter();
        System.out.println("Royce: Who are you? You think you can just walk in here and take the Flathead?");
        
        System.out.println("\n1. [Draw weapon] Blow his head off before he pulls the trigger.");
        System.out.println("2. [Negotiate] Tell him Dex DeShawn already paid Brick for it.");
        
        int choice = InputUtils.getInt();
        Enemy royce = new Enemy("Simon 'Royce' Randall", 100, 20);
        
        if (choice == 1) {
            System.out.println("\nYour reflexes kick in. You draw your Lexington and fire a round straight into his cybernetic jaw!");
            InputUtils.waitForEnter();
            royce.takeDamage(40);
            System.out.println("Royce staggers back, taking 40 damage, but activates his exo-suit!");
        } else {
            System.out.println("\nRoyce: Brick is dead! I run Maelstrom now!");
            InputUtils.waitForEnter();
            System.out.println("Royce shoots you in the shoulder point-blank before the fight even begins!");
            player.takeDamage(25);
            System.out.println("You take 25 damage. Royce steps back and readies his heavy laser cannon.");
        }
        
        InputUtils.waitForEnter();
        combatService.initiateCombat(player, royce);
        
        if (player.isAlive()) {
            System.out.println("\nJackie Welles: Jesus, V! That was close. Grab the Flathead, let's get back to Dex.");
            InputUtils.waitForEnter();
        }
    }

    private void missionFive(Player player) {
        System.out.println("\nMISSION 5: THE HEIST");
        InputUtils.waitForEnter();
        System.out.println("You and Jackie are hidden inside the penthouse suite of Konpeki Plaza. You have the Relic.");
        InputUtils.waitForEnter();
        System.out.println("Suddenly, the door opens. Saburo Arasaka, the Emperor himself, enters with his son, Yorinobu.");
        InputUtils.waitForEnter();
        System.out.println("You watch in horror from behind a smart-glass screen as Yorinobu strangles his father to death.");
        InputUtils.waitForEnter();
        System.out.println("Yorinobu: CODE RED! My father has been poisoned! Lock down the hotel!");
        
        InputUtils.waitForEnter();
        System.out.println("\nT-Bug (Comms): They're locking the whole network down. You need to jump out the window to the maintenance shaft, NOW!");
        InputUtils.waitForEnter();
        System.out.println("As you slide down the roof, the Relic's casing gets damaged. Jackie is bleeding out.");
        InputUtils.waitForEnter();
        System.out.println("Jackie Welles: Take the chip, V. Slot it into your neural port. It's the only way to keep it safe.");
        
        System.out.println("\n1. Slot the Relic into your head.");
        InputUtils.getInt();
        player.setHealth(player.getHealth() + 20);
        System.out.println("\nYou slot the chip. The world flashes blue. Systems rebooting.");
        InputUtils.waitForEnter();
        System.out.println("An Arasaka Security Mech breaches your location.");
        
        InputUtils.waitForEnter();
        Enemy mech = new Enemy("Arasaka Minotaur Mech", 150, 30);
        combatService.initiateCombat(player, mech);
    }
    
    private void missionSix(Player player) {
        System.out.println("\nMISSION 6: THE AFTERMATH");
        InputUtils.waitForEnter();
        System.out.println("You escape Konpeki Plaza in the Delamain cab. The rain is hammering against the windows.");
        InputUtils.waitForEnter();
        System.out.println("Jackie is slumped in the seat next to you, breathing heavily. He is bleeding out from a gut wound.");
        InputUtils.waitForEnter();
        System.out.println("Jackie Welles: I'm not gonna make it, V. Take my engram... take the Relic.");
        InputUtils.waitForEnter();
        System.out.println("Jackie pulls the biochip from his slot and hands it to you before his eyes go glassy.");
        InputUtils.waitForEnter();
        System.out.println("Delamain: Passenger deceased. Where should I transport the remains?");

        System.out.println("\n1. Send him to his family.");
        System.out.println("2. Send him to Viktor Vector's clinic.");

        int jackieChoice = InputUtils.getInt();
        if (jackieChoice == 1) {
            System.out.println("\nDelamain: Routing to the Welles residence.");
            InputUtils.waitForEnter();
            System.out.println("You take a moment to say goodbye. You take Jackie's lucky lighter.");
            player.equipItem(new Item("Jackie's Lighter", 45));
        } else {
            System.out.println("\nDelamain: Routing to Viktor Vector's clinic.");
            InputUtils.waitForEnter();
            System.out.println("You hope Vik can do something, even though you know it's too late.");
        }

        InputUtils.waitForEnter();
        System.out.println("\nYou arrive at the No-Tell Motel to meet Dexter DeShawn.");
        InputUtils.waitForEnter();
        System.out.println("Dexter DeShawn: V. You made it. But the news is screaming about Saburo Arasaka's murder.");
        InputUtils.waitForEnter();
        System.out.println("Dexter DeShawn: You brought the heat of the entire Arasaka corporation down on us. I can't have loose ends.");
        InputUtils.waitForEnter();
        System.out.println("Dexter's massive bodyguard, Oleg, steps out from the shadows.");

        System.out.println("\n1. [Try to reason] We have the Relic! We can still sell it!");
        System.out.println("2. [Attack] I knew you'd cross me, Dex!");

        int dexChoice = InputUtils.getInt();
        Enemy oleg = new Enemy("Oleg", 140, 20);

        if (dexChoice == 1) {
            System.out.println("\nDexter DeShawn: Too risky. Oleg, handle it.");
            InputUtils.waitForEnter();
            System.out.println("Oleg gets a free hit while you try to talk!");
            player.takeDamage(20);
            System.out.println("You take 20 damage from Oleg's sucker punch.");
        } else {
            System.out.println("\nYou draw your iron, but Oleg is fast for a big man.");
            InputUtils.waitForEnter();
            System.out.println("You shoot Oleg in the knee, giving you the upper hand!");
            oleg.takeDamage(30);
            System.out.println("Oleg takes 30 damage.");
        }

        InputUtils.waitForEnter();
        combatService.initiateCombat(player, oleg);

        if (player.isAlive()) {
            System.out.println("\nYou manage to drop Oleg, but you're exhausted.");
            InputUtils.waitForEnter();
            System.out.println("Before you can turn around, Dexter pistol-whips you. You fall to the floor, head ringing.");
            InputUtils.waitForEnter();
            System.out.println("Dexter DeShawn: Nothing personal, V. Just business.");
            InputUtils.waitForEnter();
            System.out.println("Dex points his gun at your head and pulls the trigger. Everything goes black.");
            player.setHealth(1);
            InputUtils.waitForEnter();
        }
    }
}