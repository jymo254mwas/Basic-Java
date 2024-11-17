import java.util.Scanner;

class  Test001{

    public Test001(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = scanner.nextInt();

        System.out.println("Enter the second number:");
        int second = scanner.nextInt();

        System.out.println("Enter the third number:");
        int third = scanner.nextInt();

        System.out.println(findMax(first, second, third));

    }//constructor
/*create a method that compares three integers and returns the biggest
 * among the three
 */

 public int findMax(int num1, int num2, int num3) {

    int i;

    if(num1 >num2 && num1 > num3){
i = num1;

    }else if(num2 >num1 && num2 > num3){
        i = num2;
    }else{
        i = num3;
    }
    return i;
 }//findMax
}