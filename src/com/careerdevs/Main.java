package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        //Challenge 1
        String firstName = "Michael ";
        String lastName = "Guadagni ";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Challenge 2
        System.out.println(createFullName("Michael", "Guadagni"));

        //Challenge 3
        String generatedName = NameGenerator.generateFullName("first", "last");
        System.out.println(generatedName);

        //Challenge 4
        Car carOne = new Car("Camaro 2SS", "Chevy", 10_000, 0.10f);
        System.out.println("Make: " + carOne.make + "  Model: " + carOne.model);
        Car carTwo = new Car("Mustang GT", "Ford", 30_000, 0.50f);
        System.out.println("Make: " + carTwo.make + "  Model: " + carTwo.model);
        Car carThree = new Car("Hellcat", "Dodge", 100, 0.90f);
        System.out.println("Make: " + carThree.make + "  Model: " + carThree.model);

    }

    //Challenge 2
    public static String createFullName(String fName, String lName) {
        return fName + " " + lName;
    }
}


