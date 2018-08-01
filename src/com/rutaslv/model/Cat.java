package com.rutaslv.model;

public class Cat extends Animal {
    public Cat(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move() {
        super.move();
        System.out.println("I sleep all day. Shhhh...");
    }
}
