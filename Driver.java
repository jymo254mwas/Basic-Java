class Pojo{
    private int num;//access within class 
    private String name;   

//setter method @param num : value from user
public void setNum(int num){
    this.num = num;
    }

public void setName(String name){
    this.name = name;
}
//getter method @return : gets the num value
public int getNum(){
    return num;
    }
    public String getName(){
        return name;
    }
}

public class Driver{
    public static void main(String[] args){
        Pojo pojo = new Pojo();
        pojo.setNum(30);

        Pojo p = new Pojo();
        pojo.setName("Jamo");
        System.out.println(pojo.getNum());
        System.out.println(pojo.getName());
    }
}