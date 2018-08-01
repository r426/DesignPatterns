package com.rutaslv;

import com.rutaslv.controller.AnimalFarmSingleton;
import com.rutaslv.view.InteractionWith;
import com.rutaslv.model.Animal;

import java.util.HashMap;
import java.util.Scanner;

public class MainFacade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the file containing the info about the animals.");
        String fileName = scanner.next();

        AnimalFarmSingleton animalFarmSingleton = AnimalFarmSingleton.getInstance(fileName);
        HashMap<String, Animal> theAnimals = animalFarmSingleton.getTheAnimals();
        InteractionWith interaction = new InteractionWith(theAnimals);
        interaction.go();
    }
}