package Oops;

/*class Animal{
    void eat(){
        System.out.println("eating");
    }
    void run(){
        System.out.println("running");
    }
}
public class inheritance extends Animal {

    public static void main(String[] args) {
        inheritance cat=new inheritance();
        cat.eat();
        cat.run();

        inheritance dog=new inheritance();
        dog.run();
    }
}*/


//Single inheritance
/*class A{
    void showA(){
        System.out.println("class A");
    }
}
class inheritance extends A{
    void showB(){
        System.out.println("class B");
    }

    public static void main(String[] args) {
        A obj=new A();
        obj.showA();
        //obj.showB();  //you can't call B method if you are making object from method A

        inheritance obj1=new inheritance();
        obj1.showB();
        obj1.showA();
    }

}*/

//multilevel- inheritance
/*class A{
    void showA(){
        System.out.println("i m A");
    }
}
class B extends A{
    void showB(){
        System.out.println("i m B");
    }
}
class inheritance extends B{
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
        inheritance obj3=new inheritance();
        obj3.showA();
        obj3.showB();
        obj3.ShowC();
    }

}*/

//hierarchical inheritance
/*class A{
    void showA(){
        System.out.println(" i m A");
    }
}
class B extends A{
    void showB(){
        System.out.println("i m B");
    }
}
class inheritance extends A{
    void showC(){
        System.out.println("i m C");
    }

    public static void main(String[] args) {

        System.out.println("it can only show object of class A");
        A obj1=new A();
        obj1.showA();

        System.out.println("it can only show object of class A and B");
        B obj2=new B();
        obj2.showA();
        obj2.showB();

        System.out.println("it can only show object of class A and C");
        inheritance obj3=new inheritance();
        obj3.showA();
        obj3.showC();
    }
}*/

/*class A{
    void showA(){
        System.out.println("A");
    }
}
class B extends A{
    void displayB(){
        System.out.println("B");
    }
}
class inheritance extends B{
    public static void main(String[] args) {
        A obj=new A();
        obj.showA();

        B obj1=new B();
        obj1.displayB();
    }

}*/


