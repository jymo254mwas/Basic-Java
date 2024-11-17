/* 
Recursivity/recursion/recursive methods 
 * it is a concept where a method invokes/ calls itself
 */

public class RecursiveExample{

    public RecursiveExample(){

    System.out.println(factorial(10));
    }
    public long factorial(int n) {
        if(n == 0){
            return 1;
        }
    long answer = n * factorial(n - 1);

    return answer;
    }//factorial
    public static void main(String[] args){
        new RecursiveExample();
    }
}