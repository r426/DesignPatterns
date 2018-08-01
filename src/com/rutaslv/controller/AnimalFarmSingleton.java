package com.rutaslv.controller;

import com.rutaslv.model.animals.Animal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class AnimalFarmSingleton {

    private static AnimalFarmSingleton uniqueAnimalFarm;
    private HashMap<String, Animal> theAnimals;
    private AnimalFactory animalFactory = new AnimalFactory();

    private AnimalFarmSingleton(String path) {
        theAnimals = new HashMap<String, Animal>();
        FileReader reader = null;
        try {
            reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(reader);

        while (sc.hasNext()) {
            String category = null;
            String family = null;
            String name = null;
            float weight = 0;
            float height = 0;
            String move = null;

            try {
                category = sc.next();
                family = sc.next();
                name = sc.next();
                weight = sc.nextFloat();
                height = sc.nextFloat();
                move = sc.next();
            } catch (Exception e) {
                e.printStackTrace();
            }

            Animal animal = animalFactory.makeAnimal(category, family, name, weight, height, move);

            theAnimals.put(category, animal);
        }

        sc.close();
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static AnimalFarmSingleton getInstance(String fileName){
        if(uniqueAnimalFarm == null){
            uniqueAnimalFarm = new AnimalFarmSingleton(fileName);
        }
        return uniqueAnimalFarm;
    }


    public HashMap<String, Animal> getTheAnimals() {
        return theAnimals;
    }
}
