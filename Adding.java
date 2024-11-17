// Base class
public class Adding {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Derived class
public class Addition extends Adding {
    // Overloading the add method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloading the add method to add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}
