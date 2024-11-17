
 abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
    public void getColor(){
        System.out.println("this");
    }
}
class Main0 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
    }
}

class Circle extends Shape{
    public void calculateArea(){
        System.out.println("calculating area");
    }
    public void calculatePerimeter(){
        System.out.println("calculating perimeter");
    }
}