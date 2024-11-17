import java.util.Scanner;


public class import java.util {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your score");

        int score = input.nextInt();

        String grade = null;

        if(score >= 90 && score <= 99){
            grade = "A";
        }else if(score >=80 && score <= 89){
            grade = "B";
        }else if(score >= 70 && score <= 79){
             grade = "C";
        }else if(score >= 60 && score <= 69){
            grade = "D";
        }else if(score >= 10 && score <= 56){
            grade = "F";
        }else{
            System.out.println("Invalid score");
        }

        System.out.println("you.scored." + grade);
    }//main
}//class