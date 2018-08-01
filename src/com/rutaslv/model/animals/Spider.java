package com.rutaslv.model.animals;

import com.rutaslv.model.moves.Eat;

public class Spider extends Animal {

    public Spider(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move() {
        moveBehavior = new Eat();
        moveBehavior.move();
    }
}
