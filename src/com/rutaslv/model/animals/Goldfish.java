package com.rutaslv.model.animals;

import com.rutaslv.model.moves.Swim;

public class Goldfish extends Animal {

    public Goldfish(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move() {
        moveBehavior = new Swim();
        moveBehavior.move();

    }
}
