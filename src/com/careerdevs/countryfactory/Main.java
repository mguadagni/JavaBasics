package com.careerdevs.countryfactory;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the name of your country?");
        String countryName = scanner.nextLine();

        System.out.println("What is the population of your country?");
        long countryPopulation = scanner.nextLong();

        scanner.nextLine();

        System.out.println("What is the capital of your country?");
        String countryCapital = scanner.nextLine();

        Country country1 = new Country(countryName, countryPopulation, countryCapital);

        System.out.println(country1);
    }
}
