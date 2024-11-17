class Pojo{
    private String name;//access within class    

//setter method @param num : value from user
public void setName(String name){
    this.name = name;
    }
//getter method @return : gets the num value
public int getName(){
    return name;
    }
}

public class Driver2{
    public static void main(String[] args){
        Pojo pojo = new Pojo();
        pojo.setName(james);
        System.out.println(pojo.getName());
    }
}