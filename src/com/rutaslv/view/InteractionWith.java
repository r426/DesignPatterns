package com.rutaslv.view;

import com.rutaslv.model.animals.Animal;

import java.util.HashMap;
import java.util.Scanner;

public class InteractionWith {
    HashMap<String, Animal> theAnimals;

    public InteractionWith(HashMap<String, Animal> theAnimals) {
        this.theAnimals = theAnimals;
    }

    public void go() {

        Scanner scanner = new Scanner(System.in);
        String animal;
        System.out.println("Hi there! Animals are waiting for you. Which one would you like to choose?");

        System.out.println(theAnimals.keySet());
        animal = scanner.nextLine();
        StringBuilder theLineToPrint = new StringBuilder("");
        theLineToPrint.append("The " + theAnimals.get(animal).getCategory());
        theLineToPrint.append(" " + theAnimals.get(animal).getName());
        theLineToPrint.append(" is a " + theAnimals.get(animal).getFamily());
        theLineToPrint.append(" and it " + theAnimals.get(animal).getMove() + "s a lot.\n");
        theLineToPrint.append("It weighs " + theAnimals.get(animal).getWeight() + " kilos ");
        theLineToPrint.append("and is  " + theAnimals.get(animal).getHeight() + " cm high.");
        System.out.println(theLineToPrint);
        System.out.println();
        System.out.println("Would you like to change the behavior? – yes? no?");
        String choice = scanner.next();
        switch (choice) {
            case "yes":
                System.out.println("Whose behavior do you want it perform?");
                System.out.println(theAnimals.keySet());
                System.out.println();
                animal = scanner.next();
                break;
            default:
                break;
        }
        theAnimals.get(animal).move();
    }
}


