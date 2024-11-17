/*5.Write a Java program that takes number from 1 - 7 as input and prints
 corresponding Day of the week as switch case*/


import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number from 1 to 7
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        // Determine the corresponding day of the week using a switch statement
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
} 




/*To run this program, compile it with javac DayOfWeek.java(file name) and then run it with java DayOfWeek.(foldername)

Hio Code inadisplay days of the week form Mon to Sunday (1-7)*/
