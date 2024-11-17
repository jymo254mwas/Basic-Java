/*write a java program is that declares two variables x and y ,assigns them values,and calculates :the average  of x and y,the remainder
 when x is divided by y,the result of raising x to the power of y */
 
 /**
  * AverageCalculator
  */
  public class  AverageCalculator{
    /**
     * @param args
     */
    public static void main(final String[] args) {
        // Declare two integer variables 'a' and 'b'
        final int a = 7;
        final int b = 9;
        
        // Subtract 'b' from 'a' and print the result
        final int subtractionResult = a - b;
        System.out.println("Subtraction (a - b): " + subtractionResult);
        
        // Multiply 'a' and 'b' and print the result
        final int multiplicationResult = a * b;
        System.out.println("Multiplication (a * b): " + multiplicationResult);
        
        // Divide 'a' by 'b' and print the result
        // Ensure b is not zero to avoid division by zero error
        if (b != 0) {
            final int divisionResult = a / b;
            System.out.println("Division (a / b): " + divisionResult);
        } else {
            System.out.println(D);
        }
}
  }
    
 