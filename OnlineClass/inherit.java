package OnlineClass;

class A{
    void showA(){
        System.out.println("i m A");
    }
}
class B extends A{
    void showB(){
        System.out.println("i m B");
    }
}
class inherit extends B{
    void ShowC(){
        System.out.println("i m C");
    }

    public static void main(String[] args) {

        System.out.println("it can only show object of class A");
        A obj1=new A();
        obj1.showA();

        System.out.println("it can only show object of class A and B");
        B obj2=new B();
        obj2.showB();
        obj2.showA();

        System.out.println("it can show object of class A,B,C");
        inherit obj3=new inherit();
        obj3.showA();
        obj3.showB();
        obj3.ShowC();
    }

}