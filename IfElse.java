import java.util.Scanner;
/**
 * IfElse
 */
public class IfElse {

    public static void main(String[] args) {
        
        int marksObtained,passingMarks;passingMarks = 40;

        Scanner scanner = new Scanner(Sytem.in);

        System.out.println("input marks scored by you");

        marksObtained = input.nextInt();
        if(marksObtained >= passingMarks) {
            System.out.println("you passed the exam");
        }
        else{
            System.out.println("Unfortunately you failed to pass the exam");
        }
    }
}