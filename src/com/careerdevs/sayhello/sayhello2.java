package com.careerdevs.sayhello;

import java.util.Scanner;

public class sayhello2 {
    public static void sayhello2(String[] args) {
        sayHello();
    }

    public static void sayHello() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name? ");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name? ");
        String lastName = scanner.nextLine();

        System.out.println("It is nice to formally meet you, " + firstName + " " + lastName);

        System.out.println("What is your favorite color?");
        String favColor = scanner.nextLine();

        System.out.println("Wow, " + favColor + " is my favorite color too!");

    }
}
