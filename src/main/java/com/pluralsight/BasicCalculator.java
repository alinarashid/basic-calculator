package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // System.in = the keyboard
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();  // eat the leftover

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String option = scanner.nextLine();

        int product = firstNumber * secondNumber ;
        System.out.println(" Equation: " + firstNumber+" * "+secondNumber+" = "+ product);



    }
}
