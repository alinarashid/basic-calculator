package com.pluralsight;

import java.util.Scanner;


public class PayrollCalculator {

    public static void main(String[] args) {

        // Create ONE Scanner to read keyboard input, passed to methods that need it
        Scanner scanner = new Scanner(System.in);   // System.in = the keyboard

        // Get the employee's full name
        String employeeName = getEmployeeName(scanner);

        // Get hours worked and pay rate from the user
        double hoursWorked = getHoursWorked(scanner);
        double payRate = getPayRate(scanner);

        // Calculate gross pay using the values returned above
        double grossPay = calculateGrossPay(hoursWorked, payRate);

        // Display the employee's name and gross pay
        displayPay(employeeName, grossPay);
    }

    /* Asks for first and last name
       Returns: String, the full name
       Needs: the Scanner
    */
    public static String getEmployeeName(Scanner scanner) {
        // Get first name from the user
        System.out.print("Enter firstname: ");
        String firstName = scanner.nextLine();

        // Get last name from the user
        System.out.print("Enter lastname: ");
        String lastName = scanner.nextLine();

        // Return it
        return firstName + " " + lastName;

    }


    /* Asks for hours worked
       Returns: double
       Needs: the Scanner
    */
    public static double getHoursWorked(Scanner scanner) {
        // Get hours worked from the user
        System.out.print("Hours worked: ");
        double hoursWorked = scanner.nextDouble();
        return hoursWorked;
    }


    /* Asks for pay rate
       Returns: double
       Needs: the Scanner
    */
    public static double getPayRate(Scanner scanner) {
        // Get pay per hour from the user
        System.out.print("Pay per hour: ");
        double payPerHour = scanner.nextDouble();
        return payPerHour;

    }

    /* Calculates gross pay (hours x rate)
       Returns: double
       Needs: hoursWorked, payRate
    */
    public static double calculateGrossPay(double hoursWorked, double payRate) {
        // Calculate the total pay for the user
        double grossPay = hoursWorked * payRate;
        return grossPay;
    }


    /* Prints the name and gross pay as money
       Returns: nothing (void)
       Needs: name, grossPay
    */
    public static void displayPay(String name, double grossPay) {

        // format output $%.2f --> money %s --> string %n --> newline
        System.out.printf("%s earned $%.2f %n", name, grossPay);
    }
}
