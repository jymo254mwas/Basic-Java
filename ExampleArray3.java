
/**/
import java.util. Scanner;
/**
 * ExampleArray3
 */
public class ExampleArray3 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.println("How many numbers will you type?");

    int size = s.nextInt();

    int []nums = new int[size];

    System.out.println("Type the " + size +"numbers");
    //populate the array using a for loop
    for (int i = 0; i < size; i++){
        nums[i] = s.nextInt();
        while (num <= 5) 
             num = 1;

        do{
            System.out.println("Looping" + num);
            num++;

        }while (num <= 5); 
    }
  }//main  

  



















  
