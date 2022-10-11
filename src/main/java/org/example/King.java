package org.example;
import java.util.Random;

///class King
//   - attributes: int power=from 5 to 15, int hp=from 5 to 15
//   - methods: void kick(Character c) {
//                decrease number of hp of the enemy by random
//                number which will be in the range of his power
//              }
public class King extends Character{

    public King() {
        super();
        this.power = (int)(Math.random() * 10) + 5;
        this.hp = (int)(Math.random() * 10) + 5;
    }


//    public void kick(Character c) {
//        c.hp -= power;
//    }
}
