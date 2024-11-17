/* Write a java program that prompts the user to enter their pin for a maxmum
  num of 3 time. If all three attempt are wrong the program display a message
 of blocked
 */


 import java.util.Scanner;

 public class PinCheck {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         final int CORRECT_PIN = 1234; // You can set the correct PIN here
         int attempts = 0;
         boolean accessGranted = false;
 
         while (attempts < 3 && !accessGranted) {
             System.out.print("Enter your PIN: ");
             int enteredPin = scanner.nextInt();
             attempts++;
 
             if (enteredPin == CORRECT_PIN) {
                 accessGranted = true;
                 System.out.println("Access granted!");
             } else {
                 System.out.println("Incorrect PIN. Try again.");
             }
         }
 
         if (!accessGranted) {
             System.out.println("Your account is blocked.");
         }
 
         scanner.close();
     }
 }
 