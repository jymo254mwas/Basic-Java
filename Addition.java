  abstract class Adding {
    abstract void add(int a, int b);
}

public class Addition extends Adding {
    @Override
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.add(5, 3);  // Output: Sum: 8
    }
}