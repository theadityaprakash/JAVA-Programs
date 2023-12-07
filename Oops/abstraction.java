package Oops;

abstract class vehicle{
    abstract void start();
}
class car{
     void start(){
         System.out.println("Start with key");
    }
}
class scooter{
    void start(){
        System.out.println("Start with kick");
    }
}
public class abstraction {
    public static void main(String[] args) {
        car c=new car();
        c.start();

        scooter s=new scooter();
        s.start();
    }
}
