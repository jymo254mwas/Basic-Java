/*
 Write a java program that tekes an age as input and prints whether
 the person is elligible to vote or not
 */

 import java.util.Scanner;

 /**
  * Voting
  */
 public class Voting {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

System.out.println("Please type your age");

int age = input.nextInt();

if(age >= 18){

    System.out.println("Do your have a voting card? Answer with yes or no");

    String answer = input.next();

    if (answer.equals("yes")) {
     System.out.println("Elligible to vote");  
      
    }else{
        System.out.println("No voters card, cannot vote");
    }
}else{
    System.out.println("Too young to vote");
}
    }
 }




























