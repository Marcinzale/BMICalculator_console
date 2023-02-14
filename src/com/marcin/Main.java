package com.marcin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        float weight = input.nextFloat();

        System.out.print("Enter height in cm: ");
        float height = input.nextFloat();
        input.close();

        float bmi = (float) (weight / (Math.pow(height,2)/100)*100);
        float rounded = (float) Math.round(bmi);

        System.out.println("Your BMI index is: " + rounded);

        if (rounded < 16.0) {
            System.out.println("This is starvation. You need to eat more.");
        } else if ((rounded > 16) && (rounded <= 16.9)) {
            System.out.println("This is emaciation. You need to eat more.");
        } else if ((rounded >= 17.0) && (rounded <= 18.5)) {
            System.out.println("This is underweight. You need to eat more.");
        } else if ((rounded > 18.5) && (rounded <= 24.9)) {
            System.out.println("Your weight is correct.");
        } else if ((rounded >= 25) && (rounded < 29.9)) {
            System.out.println("Overweight");
        } else if ((rounded >= 30) && (rounded <= 34.9)) {
            System.out.println("First degree obesity.");
        } else if ((rounded >= 35) && (rounded <= 39.9)) {
            System.out.println("Second degree obesity.");
        } else if (rounded >= 40) {
            System.out.println("Third degree obesity.");
        }

        System.out.println("Press enter to continue.....");
    }
}
