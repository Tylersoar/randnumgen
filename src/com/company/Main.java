package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        randomNumber();


    }

    private static void randomNumber() {
        while (true) {
            try {
                Random random = new Random();
                Scanner input = new Scanner(System.in);

                System.out.println("Please enter a lower bound number");
                int lowerBound = input.nextInt();

                System.out.println("Please enter a upper bound number");
                int UpperBound = input.nextInt();

                int randomnum = random.nextInt(UpperBound - lowerBound) + lowerBound;

                System.out.println("The number generated was: " + randomnum);

            } catch (Exception e) {
                System.out.print("Error: " + e);
                System.out.println(" - please only enter numbers");


            }
        }
    }
}








