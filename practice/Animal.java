package practice;

//multilevel inheritance

class Dog {
    void eat(){
        System.out.println("eating");
    }
    void run(){
        System.out.println("running");
    }
}
class cat extends Dog{
    void eat1() {
        System.out.println("cat eating");
    }
}
public class Animal extends cat{
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.eat();
        obj.run();
        obj.eat1();
    }
}
