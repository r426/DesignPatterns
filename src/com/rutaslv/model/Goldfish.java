package com.rutaslv.model;

public class Goldfish extends Animal {

    public Goldfish(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move(){
        super.move();
        System.out.println("I swim all day. My home is my ocean.");
    }
}
