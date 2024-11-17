import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;

/**
|---------------------------------------------|
|public class Circle                          |
|---------------------------------------------|
|public - an access specified, ie class can   |
|be accessed from anywhere. its optional      |
|a class can also be:protected, default but   |
|private.                                     |
|'Circle' - This is the class name which      |
|should also be the file name.                |
|'{}' - braces means that this is a block.    |
|class - is a syntax and a reserved keyword.  |
|It denotes the start of the java program.    |
|---------------------------------------------|
 */
public class Circle {
    /*final means the value cant be re-initialized
     * static means the value belongs to the class
     PIE - data member/variable*/
    private static final double PIE =3.142;

    /*doble is primtive data type that will be
     * returned at the end of program execution.
     
     Primitive types are used when you want to perform
      calculations

      On the other hand you can use Double which is a wrapper
      class when you want to access methods eg toStrings()*/
    public double calculateArea(double radius){
        double area = PIE *radius* radius;

    return area;
}
/*void 
 * -----------------------------------------------------
 * means no return type
 * calculateCircumference() - method name.
 * () - parenthesis : Hold arguments
 */
public void calculateCircumference(double diameter){

    
}
public static void main(String[] args) {
    Circle circle = new Circle();
    System.out.println(circle. calculateArea(100));
}
 }

    
