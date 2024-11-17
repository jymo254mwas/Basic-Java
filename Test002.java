
/**
 * It is a concept where objects behave differently based on the input
 * Runtime - inheritance
 * Compile time - overloading
 * POJO (plain Old java Object)/java bean/utility(helper) class
 */
public class Test002 {

 private String name;
 private int age;
 
 public Test002() {
}
public Test002(String name, int age) {
    this.name = name;
}
public Test002(String name, int age) {
    this.name = name;
    this.age = age;
}
public Test002(int age) {
    this.age = age;
}
public void setName(String n) {
    this.name = n;
}
public String getName() {
    return name;
}
}