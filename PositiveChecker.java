import java.util.Scanner;


public class positiveChecker {

    public static void main(String[] args) {
        
        Scanner scan = new Scaner(System.in);

        System.out.println("Type any number");

        int num = scan.nextInt();

        if (num > 0){

            System.out.println("Number is positive");

        }else if(num < 0){

            System.out.println("Number is negative");

        }else{

            System.out.println("Number is zero");

        }//else
    }//main method
}//class