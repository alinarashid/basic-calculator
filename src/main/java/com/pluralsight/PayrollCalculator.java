package com.pluralsight;
import java.util.Scanner;


public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // System.in = the keyboard

        // Get first name from the user
        System.out.print("Enter firstname: ");
        String firstName = scanner.nextLine();

        // Get last name from the user
        System.out.print("Enter lastname: ");
        String lastName = scanner.nextLine();

        // Get hours worked from the user
        System.out.print("Hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Get pay per hour from the user
        System.out.print(" Pay per hour: ");
        double payPerHour = scanner.nextDouble();


        // Calculate the total pay for the user
        double totalPay = hoursWorked * payPerHour;

        // format output $%.2f --> money %s --> string %n --> newline
        System.out.printf("%s %s earned $%.2f %n",firstName,lastName,totalPay);


    }
}
