import java.util.Scanner;
class LinearSearchAlgo{

    /*
     1. Has the same name as class
     2. it has a special method which which does not have a return type
     3. it's work is to build or construct details about our class
     */
    public LinearSearchAlgo(String find) {
        String []majina = {"John", "Jameds", "Gabriel", "Emmanuel",};

        for(int i = 0; i < majina.length; i++){
            if(find.equalsIgnoreCase(majina[i])){
                System.out.println("Found at index" + i);
            }
        }
        /*
         int nums[] ={14, 33, 20, 5, 15, 2};
         for(int i =0; i <nums.length; i++){

         if(find == nums[i]){

         System.out.println("Found at index" + i);
*/
    
        
    }//if
}//for