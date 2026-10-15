package com.pluralsight;
import java.util.Scanner;


public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // System.in = the keyboard
        System.out.print("Enter firstname: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter lastname: ");
        String lastName = scanner.nextLine();
        System.out.print("Hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print(" Pay per hour: ");
        double payPerHour = scanner.nextDouble();


    }
}
