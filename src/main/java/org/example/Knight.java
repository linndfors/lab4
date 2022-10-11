package org.example;

///class Knight
//   - attributes: int power=from 2 to 12, int hp=from 2 to 12
//   - methods: void kick(Character c) { like King }

public class Knight extends King{

    public Knight() {
        super();
        this.power = (int)(Math.random() * 10) + 2;
        this.hp = (int)(Math.random() * 10) + 2;
    }
}
