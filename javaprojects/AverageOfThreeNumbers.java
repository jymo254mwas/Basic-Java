/*Write a Java program that reads three numbers from the user and prints their average */
import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3;

        // Print the result
        System.out.println("The average of the three numbers is: " + average);
    }
}
