package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What species is your animal?");
        String animal1Species = scanner.nextLine();

        System.out.println("How many legs does your animal have?");
        short animal1Legs = scanner.nextShort();

        System.out.println("True or False: Your animal is terrestrial.");
        boolean animalIsTerrestial = scanner.nextBoolean();

        Animal animal1 = new Animal(animal1Species,  animal1Legs, animalIsTerrestial);

        System.out.println(animal1);


    }
}
