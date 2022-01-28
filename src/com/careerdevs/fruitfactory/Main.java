package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is the name of your fruit?");
        String fruitName = scanner.nextLine();
        System.out.println("The name of your fruit is " + fruitName + ".\n");

        System.out.println("What is the color of your fruit?");
        String fruitColor = scanner.nextLine();

        System.out.println(" ");

        System.out.println("Your fruit has seeds.\nTrue of False:");
        boolean fruitHasSeeds = scanner.nextBoolean();

        System.out.println(" ");

        Fruit fruit1 = new Fruit(fruitName, fruitColor, fruitHasSeeds);

        System.out.println(fruit1);
    }

}
