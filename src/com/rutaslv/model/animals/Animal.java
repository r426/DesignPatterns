package com.rutaslv.model.animals;

import com.rutaslv.model.interfaces.Move;

public class Animal {

    Move moveBehavior;

    String category;
    String family;
    String name;
    float weight;
    float height;
    String move;

    public Animal(String category, String family, String name, float weight, float height, String move) {
        this.category = category;
        this.family = family;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.move = move;
    }

    public String getCategory() {
        return category;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public String getMove() {
        return move;
    }


    public void move() {
        moveBehavior.move();
    }

}
