package com.rutaslv.view;

import com.rutaslv.model.Animal;

import java.util.HashMap;
import java.util.Scanner;

public class InteractionWith {
    HashMap<String, Animal> theAnimals;

    public InteractionWith(HashMap<String, Animal> theAnimals) {
        this.theAnimals = theAnimals;
    }

    public void go() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi there! Animals are waiting for you. Which one would you like to see?");
        System.out.println(theAnimals.keySet());
        String animal = scanner.nextLine();
        StringBuilder theLineToPrint = new StringBuilder("");
        theLineToPrint.append("The " + theAnimals.get(animal).getCategory());
        theLineToPrint.append(" " + theAnimals.get(animal).getName());
        theLineToPrint.append(" is a " + theAnimals.get(animal).getFamily());
        theLineToPrint.append(" and it " + theAnimals.get(animal).getMove() + " a lot.\n");
        theLineToPrint.append("It weighs " + theAnimals.get(animal).getWeight() + " kilos ");
        theLineToPrint.append("and is  " + theAnimals.get(animal).getHeight() + " cm high.");
        System.out.println(theLineToPrint);
        System.out.println();
        theAnimals.get(animal).move();

    }

}
