package com.rutaslv.model;

public class Spider extends Animal {

    public Spider(String category, String family, String name, float weight, float height, String move) {
        super(category, family, name, weight, height, move);
    }

    public void move() {
        System.out.println("I eat all day. Yammy flies!");
    }
}
