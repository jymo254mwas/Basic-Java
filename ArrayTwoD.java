//* */


/**
 * Array2D
 */
public class ArrayTwoD {

    public static void main(String[] args) {
        
//irregular/jagger array
    //int [] []nums = new int[4] [3];
    
   int [] [] nums = {
        {10, 2, 5},
        {6, 30, 7},
        {90, 8, 20},
        {18},
        {7, 23, 1, 12}
    };
    //knows about the index
     /*for (int r = 0; r < nums.length; r++){
       
      
        for (int c = 0; c < nums.length; c++){
            System.out.print(nums[r][c] +" \t"); 
        } 
        System.out.println(""); 
        }*/
      for(int [] row: nums) {
        for (int element : row){
            System.out.print(element + "\t");
        }
        System.out.println("");
      }

}
    }
