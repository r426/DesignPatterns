package com.rutaslv.model;

public class Parrot extends Animal {

    public Parrot(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move(){
        super.move();
        System.out.println("I sing all day. Do you like my songs?");
    }
}
