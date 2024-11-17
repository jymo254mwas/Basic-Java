class Animal{//super class, base class, parent class
    int run = 100;
    public void backing(){
        System.out.println("the dog is backing");
    }
}


/*This class acquries all the behaviour and fields in Animal class
 * i.e variable and methods
 */

 /**
  * Dog
  */
 class Dog extends Animal{//child class,sub class,deriver class
    public static void main(String[] args) {
        Dog d = new Dog();
        d.backing();//inherited from the veicle class
        System.out.println(d.run);//access the super class variable
    }
  
 }

 

