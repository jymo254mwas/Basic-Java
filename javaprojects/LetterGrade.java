
/*Write a Java program that reads a score from the user and prints the corresponding letter
grade based on the following criteria:
a. 90-100: A
b. 80-89: B
c. 70-79: C
d. 60-69: D
e. Below 60: F

*/
import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a score
        System.out.print("Enter the score: ");
        int score = scanner.nextInt();

        // Determine the letter grade
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Print the letter grade
        System.out.println("The letter grade is: " + grade);
    }
}
