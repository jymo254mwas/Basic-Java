import java.util.Scanner;
  // util.Scanner accepts users inputs
    //scanner placeholder
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying the calculator operations
        System.out.println("Simple Calculator");
        System.out.println("Select an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");

        // Taking the operation input from the user
        System.out.print("Enter your sign: ");
        int choice = scanner.nextInt();

        // Taking the operand inputs from the user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Performing the selected operation
        double result = 0;
        boolean validOperation = true;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
                validOperation = false;
                break;
        }

        // Displaying the result if the operation was valid
        if (validOperation) {
            System.out.println("The result is: " + result);
        
 }
        // Closing the scanner
// MUUUNIAMBIE II 
    }
}
