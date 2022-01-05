package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        //Challenge 1
	    /*String firstName = "Michael ";
        String lastName = "Guadagni ";
        String fullName = firstName + lastName;
        System.out.println(fullName);*/
        System.out.println(createFullName("Michael","Guadagni"));

    }
    //Challenge 2
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

}