package org.example;
///class Hobbit
//  - attributes: int power=0, int hp=3
//  - methods: void kick(Character c) { toCry() }

public class Hobbit extends Character{

    public Hobbit() {
        super();
        this.power = 0;
        this.hp = 3;
    }

    private static void toCry() {
        System.out.println("AAAAAAAA");
    }

    public void kick(Character c) {
        toCry();
    }
}
