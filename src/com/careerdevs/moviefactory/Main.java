package com.careerdevs.moviefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the title of your movie?");
        String movieName = scanner.nextLine();

        System.out.println("Who is the director of the film?");
        String movieDirector = scanner.nextLine();

        System.out.println("How long is the movie? (in minutes)");
        int runTimeInMin= scanner.nextInt();

        scanner.nextLine();

        System.out.println("The film has been released, True or False");
        boolean hasBeenReleased = scanner.nextBoolean();

        Movie movie1 = new Movie(movieName, movieDirector, runTimeInMin, hasBeenReleased);

        System.out.println(movie1);
    }
}
