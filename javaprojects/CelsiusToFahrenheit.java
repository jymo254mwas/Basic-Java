import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit.");
    }
}
