package practice;

interface animal{
    void eat();
}

interface bird{
    void fly();
}
public class multi_inhert implements animal,bird {
    @Override
    public void eat() {
        System.out.println("eating");
    }

    public void fly(){
        System.out.println("flying");
    }

    public static void main(String[] args) {
        multi_inhert obj=new multi_inhert();
        obj.eat();
        obj.fly();
    }
}
