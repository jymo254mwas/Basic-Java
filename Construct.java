 public class Construct{
    Construct(){//default constructor
        System.out.println("default constructor");
    }
    public Construct(String x ){//parameterized constructor
        System.out.println("parameter constructor x =" +x);
    }
    public Construct(String y,int a ){//parameterized constructor
        System.out.println("parameter constructor y = " +y);
    }
    public Construct(double money){
        System.out.println("ksh"+money);
    }
    public static void main(String[] args){
       Construct c = new Construct();
       Construct c2 = new Construct("hello there");
       Construct c3 = new Construct("hello ,20");
       Construct c4 = new Construct("$100");
    }
}