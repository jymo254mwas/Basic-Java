import javax.swing.JOptionPane;

class Input {

    public static void main(String[] args) {
        
        string first = JOptionPane.showInputDialog(null, "please type the first number");

        
        string second = JOptionPane.showInputDialog(null, "please type the second number");

        int num1 = Integer.parseInt(first);

        int num2 = Integer.parseInt(second);

        int sum = num1 + num2;

        System.out.println(sum); 
    }

    
}