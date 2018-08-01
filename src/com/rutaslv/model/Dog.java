package com.rutaslv.model;

public class Dog extends Animal {
    public Dog(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move(){
        super.move();
        System.out.println("I play all day. Come and paly with me!");
    }
}
