package com.rutaslv.model.animals;

import com.rutaslv.model.moves.Sing;

public class Parrot extends Animal {

    public Parrot(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move() {
        moveBehavior = new Sing();
        moveBehavior.move();
    }
}
