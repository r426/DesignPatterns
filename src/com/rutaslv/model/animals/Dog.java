package com.rutaslv.model.animals;

import com.rutaslv.model.interfaces.Move;
import com.rutaslv.model.moves.Play;

public class Dog extends Animal {
    public Dog(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move() {
        moveBehavior = new Play();
        moveBehavior.move();
    }
}
