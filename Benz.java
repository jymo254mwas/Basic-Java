class Vehicle{//super class, base class, parent class
    int speed = 100;
    public void hooting(){
        System.out.println("the car is hooting");
    }
}


/*This class acquries all the behaviour and fields in Vehicle class
 * i.e variable and methods
 */

 /**
  * Benz
  */
 class Benz extends Vehicle {//child class,sub class,deriver class
    public static void main(String[] args) {
        Benz b = new Benz();
        b.hooting();//inherited from the veicle class
        System.out.println(b.speed);//access the super class variable
    }
  
 }

 //LorryBenz
 class Lorry extends Benz{
    public static void main(String[] args){
        Lorry l = new Lorry();  
        l.hooting();
        System.out.println("l.speed");
    }
 }

