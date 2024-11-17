import java.util.Scanner;

 class scanner{
public static void main(String[]args){

    Scanner s = new Scanner(System.in);

    System.out.println("Enter the first number");

    int num1 = s.nextInt();

    System.out.println("Enter the second number");

    int num2 = s.nextInt();

    int area = num1 * num2;

    System.out.println("the area of a rectangle: " + area);

    
}    
 }
 