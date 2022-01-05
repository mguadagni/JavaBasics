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
    }

    //Challenge 2
    public static String createFullName(String fName, String lName) {
        return fName + " " + lName;
    }
}


