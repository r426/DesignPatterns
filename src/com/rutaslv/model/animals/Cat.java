package com.rutaslv.model.animals;

import com.rutaslv.model.moves.Sleep;

public class Cat extends Animal {
    public Cat(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move() {
        moveBehavior = new Sleep();
        moveBehavior.move();
    }
}
