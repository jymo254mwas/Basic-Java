/*Write a Java program that uses a do-while loop to calculate the factorial of a given
number. */
import java.util.Scanner;

public class FactorialUsingDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int factorial = 1;
        int i = 1;
        
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
