package org.example;
import org.apache.log4j.BasicConfigurator;
//methods: void fight(Character c1, Character c2)
//        { to provide fight between to characters and explain via command line
//        what happens during fight, till both of the characters are alive }

import static org.example.CharacterFactory.createCharacter;

public class GameManager {
    public static void fight(Character c1, Character c2) {
//        condition ? consequent : alternative
        boolean player1_active = true;
        System.out.println('\n');
        int counter = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(String.format("%s punch", counter));
            counter++;
            Character killer = player1_active ? c1: c2;
            Character victim = player1_active ? c2: c1;
            System.out.println(String.format("%s kick %s", killer.getClass().getSimpleName(), victim.getClass().getSimpleName()));
            if (c1 instanceof Hobbit && c2 instanceof Hobbit){
                System.out.println("Two Hobbits can't fight, 'cause they are both friendly");
                break;
            }

            killer.kick(victim);
//            System.out.println("\n");
            if (c1 instanceof Elf && c2 instanceof Elf){
                System.out.println(String.format("%s steals %s's power, now his power is %s",
                        victim.getClass().getSimpleName(), killer.getClass().getSimpleName(), victim.getPower()));
                if (victim.getPower() == 0) {
                    System.out.println(String.format("ohh no, %s has no power", victim.getClass().getSimpleName()));
                    break;
                }
            }
            else {
                System.out.println(String.format("%s got %s damage, now his health is %s hp",
                        victim.getClass().getSimpleName(), killer.getPower(), victim.getHp()));
            }
            if (victim.getHp() == 0) {
                System.out.println(String.format("ohh no, %s die", victim.getClass().getSimpleName()));
            }
            player1_active = !player1_active;
//            c2.kick(c1);
//            String res2 = String.format("%s kick %s, now %s health = %s", c2.getClass().getSimpleName(), c1.getClass().getSimpleName(), c1.getClass().getSimpleName(), c1.getHp());
//            System.out.println(res2);
        }
    }

    public static void main(String[] args) throws Exception{
        BasicConfigurator.configure();
        Character player1 = createCharacter();
        Character player2 = createCharacter();
//        System.out.println(player1 + ", " + player2);
        fight(player1, player2);
    }
}
