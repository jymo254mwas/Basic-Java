/**
 * ExampleArray
 */
public class ExampleArray {

    public static void main(String[] args) {
        //array size is immutable(once created the size cannot be changed)
        String[]name = new String[5];
        name[0] = "John";
        name[1] = "Gabriel";
        name[2] = "James";
        name[3] = "Bryson";
        name[4] = "Eugene";

        System.out.println(name[4]);

        //declare and size in the same step
        int []nums = new int[3];
    }
}