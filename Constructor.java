public class Constructor{
    int i;
    String name;
         Constructor(){//defaut constructor
       // System.out.println("value of i="+i);
    }

    void display(){
        System.out.println("value of i = "+i);
        System.out.println("value of name = " + name);
    }
    public static void main (String[] args){
 Constructor c = new Constructor();
 c.display();
    }
}