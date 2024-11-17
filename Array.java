/**
 * ExampleArray2
 */
public class Array {

    public static void main(String[] args) {

        String []names = {"John", "Gabriel", "James", "Bryson", "Eugene"};

        //random access
       // system.out.println(names[1]);
    
        //sequential access using for loop

        for(int i = 0; i < names.length; i++){

            System.out.println(names[i]);
        }
    }
}