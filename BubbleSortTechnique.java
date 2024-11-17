
class BubbleSortTechnique{

    public BubbleSortTechnique(){

        int nums[] = {2, 15, 5, 10};
        int temp;

        /*
        Bubble sort works by comparing successive pairs of elements
        If the element on the left is bigger than the one on the
        right, swap them
        - Bubble sort should assume the array is split into two.
            -The first harf is unsorted array which initially is
            the whole array.
            -The second half is the sorted array starting on the right with the biggest number desceding
            toward the left to the smallest number. 
        While looping through the array,stop
        -We need to find a way to make our loop to repeat until the whole array is sorted
        */
        for(int i = 0; i< nums.length; i++){

            for(int counter = 0; counter< nums.length - 1; counter++){

                if(nums[counter] > nums[counter + 1]){
                    temp = nums[counter];
                    nums [counter] = nums[counter + 1];
                    nums[counter + 1]= temp;
                }//if
            }//inner loop
        }//out loop
for (int num : nums){

    System.out.println(num +"");
}
    }
    public static void main(String[] args){
        new BubbleSortTechnique();
    }
}