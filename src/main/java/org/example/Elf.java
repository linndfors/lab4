package org.example;

//class Elf
//   - attributes: int power=10, int hp=10
//           - methods: void kick(Character c) {
//           kill everybody weaker than him,
//           otherwise decrease the power of character by 1
//           }

public class Elf extends Character{

    public Elf() {
        super();
        this.power = 10;
        this.hp = 10;
    }
    public void kick(Character c) {
        if (power > c.getPower()) {
            c.setHp(0);
        }
        else {
            c.power -= 1;
        }
    }

    public static void main(String[] args) {
        Character new_elf = new Elf();
        Character new_elf2 = new Elf();
        new_elf.kick(new_elf2);
    }
}
