
public class TemperatureAdvice {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        // Provide advice based on the temperature
        if (temperature <= 10) {
            System.out.println("It's cold. Wear a jacket.");
        } else {
            System.out.println("The weather is mild. Light clothing is sufficient.");
        }

        // Close the scanner
        scanner.close();
    }
}

/*To run this program, compile it with javac TemperatureAdvice.java(file name)and then run it with java
 TemperatureAdvice.(Folder name)*/
