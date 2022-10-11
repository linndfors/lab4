package org.example;

import com.sun.jdi.Value;

///class Character
//  - attributes: int power, in hp
//  - methods: void kick(Character c), boolean isAlive()
public class Character {
    int power;
    int hp;
//    public Character() {
//    }

    public int getHp() {
        if (hp < 0) {
            setHp(0);
        }
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void kick(Character c) {
        c.hp -= this.power;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String toString(){//overriding the toString() method
        String res = this.getClass().getSimpleName() +"{hp="+ this.hp + ", power=" + this.power + "}";
        return res;
    }
}
