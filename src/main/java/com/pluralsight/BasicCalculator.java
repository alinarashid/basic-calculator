package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner to read input from the keyboard
        Scanner scanner = new Scanner(System.in);   // System.in = the keyboard

        // Get the two numbers from the user
        System.out.print("Enter first number: ");  // first number
        int firstNumber = scanner.nextInt();


        System.out.print("Enter second number: ");  // second number
        int secondNumber = scanner.nextInt();
        scanner.nextLine();  // eat the leftover

        //Show the calculation menu
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        // Get the user's choice (not used yet, since we always multiply for now)
        System.out.print("Please select an option: ");
        String option = scanner.nextLine();

        // Multiply the numbers and display the equation
        int product = firstNumber * secondNumber ;
        System.out.println(" Equation: " + firstNumber+" * "+secondNumber+" = "+ product);



    }
}
