package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        byte userAge = scanner.nextByte();
        System.out.println("Oh wow, I am " + userAge + " as well!"+ "\n");

        System.out.println("What year were you born?");
        short yearOfBirth = scanner.nextShort();
        System.out.println("Ah " + yearOfBirth + ", what a great year"+ "\n");

        System.out.println("How much does your house cost?");
        int housePrice = scanner.nextInt();
        System.out.println(housePrice + " is a great price!" + "\n");

        System.out.println("What is the price of that hamburger?");
        float burgerPrice = scanner.nextFloat();
        System.out.println("Here is " + burgerPrice + ", thank you!" + "\n");

        System.out.println("How much money do you wish to have?");
        long moneyWish = scanner.nextLong();
        System.out.println("I hope you share some of that " + moneyWish + " with me!" + "\n");

        System.out.println("What is the number for pi?");
        double piValue = scanner.nextDouble();
        System.out.println("I'll have to double check that " + piValue + "\n");

        System.out.println("A polar bear's fur is white");
        System.out.println("True or False?");
        boolean trueOrFalse = scanner.nextBoolean();
        if (trueOrFalse) {
            System.out.println(trueOrFalse + " is incorrect! " + "\n");
        } else {
            System.out.println(trueOrFalse + " is correct!" + "\n");
        }

        scanner.nextLine();

        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("What a lovely name! Nice to meet you, " + userName + "\n");

    }
}


