/**
 * CalculateArray
 */
public class CalculateArray {

    public static void main(String[] args) {
        int []nums = {2, 10, 15, 5 ,8};
        int sum = 0;
        for(int num : nums){
            nums += sum;   
        }


        double average = (double) sum / nums.lenths;
        System.out.println("sum:" + sum);
        
        System.out.println("Average:" + average);
    
    }
}