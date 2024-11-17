public class Calculater{
    public void data(String a){
        System.out.println("value=" +a);
    }

public void data(int a){
    System.out.println("value=" +a);
}
public void data(int a,int b ){
    System.out.println("value=" +a+"&"+b);
}
public static void main(String[] args){
    Calculater  Calculater = new  Calculater ();
    Calculater.data("hello");
    Calculater.data(3);
    Calculater.data(3,5);
}
}