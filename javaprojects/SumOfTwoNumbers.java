/*Write a Java program that uses the `Scanner` class to read two integers from the user,
calculates their sum, and prints the result.*/
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        // Calculate the sum of the two integers
        int sum = a + b;

        // Print the result
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
