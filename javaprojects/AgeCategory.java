import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Determine the age category
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age <= 64) {
            System.out.println("You are an adult.");
        } else if (age >= 65) {
            System.out.println("You are a senior.");
        } else {
            System.out.println("Invalid age entered.");
        }
    }
}
