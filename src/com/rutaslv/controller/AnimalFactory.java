package com.rutaslv.controller;

import com.rutaslv.model.*;

public class AnimalFactory {

    public Animal makeAnimal(String category, String family, String name, float weight, float height, String move) {
        Animal animal = null;
        switch (category.toLowerCase()) {
            case "dog":
                animal = new Dog(category, family, name, weight, height, move);
                break;
            case "cat":
                animal = new Cat(category, family, name, weight, height, move);
                break;
            case "spider":
                animal = new Spider(category, family, name, weight, height, move);
                break;
            case "goldfish":
                animal = new Goldfish(category, family, name, weight, height, move);
                break;
            case "parrot":
                animal = new Parrot(category, family, name, weight, height, move);
                break;
        }
        return animal;
    }
}
