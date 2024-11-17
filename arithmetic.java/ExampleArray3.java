
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
    }
int count = 0;
    System.out.println("\n\nThe array elements are:");
    //for-each to display all elements in the array
    for(int number : nums){
        System.out.print(number);
        count++;
        if(count< size){
            System.out.print(",");
        }
    }
  }//main  
}//class