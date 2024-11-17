/*write a java program is that declares two variables x and y ,assigns them values,and calculates :the average  of x and y,the remainder
 when x is divided by y,the result of raising x to the power of y */
 public class Main {
    public static void main(String[] args) {
        // Declare and assign values to variables
        int x = 10;
        int y = 2;

        // Calculate the average
        double average = (x + y) / 2.0;
        System.out.println("Average of x and y: " + average);

        // Calculate the remainder
        int remainder = x % y;
        System.out.println("Remainder when x is divided by y: " + remainder);

        // Calculate x raised to the power of y
        double power = Math.pow(x, y);
        System.out.println("x raised to the power of y: " + power);
    }
}
