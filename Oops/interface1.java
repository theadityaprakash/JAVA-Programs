package Oops;

/*interface I1{
    void show();
}
class interface1 implements I1{
    @Override
    public void show() {
        System.out.println("1");
    }

    public static void main(String[] args) {
        interface1 obj=new interface1();
        obj.show();
    }
}*/

//Quetion no.1  input output using interface

/*import java.util.Scanner;

interface I1{
    void input();
    void output();
}

class interface1 implements I1{
    String name;
    int salary;
    public void input(){;

        Scanner s=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=s.next();

        System.out.print("Enter your Salary: ");
        salary=s.nextInt();
    }
    public void output(){
        System.out.println(name+"  "+salary);
    }

    public static void main(String[] args) {
        I1 obj=new interface1();
        obj.input();
        obj.output();
    }
}*/

//Question no. 2
/*interface customer{
    int amt=5;  //public + static + final
    void service(); //public + abstract
    public abstract void purches(); //public abstract

    //both method are same service and purches we can write it in both ways
}
class interface1 implements customer{
    @Override
    public void service() {
        System.out.println(amt);
    }
    public void purches(){
        System.out.println("the amount is "+amt);
    }

    public static void main(String[] args) {
        customer obj=new interface1();
        obj.service();
        obj.purches();
    }
}*/

//interface method
/*interface client{
    void frontWeb();
    void backWeb();
}
abstract class WebTech implements client{
    public void frontWeb(){
        System.out.println("This is front end");
    }
}
class digTech extends WebTech{
    public void backWeb(){
        System.out.println("This is backend");
    }
}
class interface1{
    public static void main(String[] args) {
        digTech obj=new digTech();
        obj.frontWeb();
        obj.backWeb();
    }
}*/

//multiple inheritance using interface

//type 1
/*interface A{
    void show();
}
interface B{
    void show();
}

class interface1 implements A,B{
    public void show(){
        System.out.println("method A and B");
    }

    public static void main(String[] args) {
        interface1 obj=new interface1();
        obj.show();
    }
}*/

//type 2
/*interface A{
    void show();
}
interface B{
    void display();
}

class interface1 implements A,B{
    public void show(){
        System.out.println("show");
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {
        interface1 obj=new interface1();
        obj.show();
        obj.display();
    }
}*/

//using Extend keyword
/*interface A{
    void add();
}
interface B extends A{
    void sub();
}

class calculation implements B{

    @Override
    public void add() {
        int a=21;
        int b=5;
        int c=a+b;
        System.out.println("Addition : "+c);
    }

    @Override
    public void sub() {
        int a=21;
        int b=5;
      int c=a-b;
        System.out.println("Subtraction : "+c);
    }
}
class interface1{
    public static void main(String[] args) {
        calculation obj=new calculation();
        obj.add();
        obj.sub();
    }
}*/

//Same code but little improved
/*interface A{
    void add();
}
interface B extends A{
    void sub();
}

class calculation implements B{
    int a=21;
    int b=5;
    @Override
    public void add() {
        int c=a+b;
        System.out.println("Addition : "+c);
    }

    @Override
    public void sub() {
        int c=a-b;
        System.out.println("Subtraction : "+c);
    }
}
class interface1{
    public static void main(String[] args) {
        calculation obj=new calculation();
        obj.add();
        obj.sub();
    }
}*/

//Default method
 /*interface A{
     void a1();
     void b1();
     default void c1(){
         System.out.println("Default");
     }
}
class B implements A{
     public void a1(){
         System.out.println("B a1");
     }
     public void b1(){
         System.out.println("B b1");
     }

    @Override
    public void c1() {
        System.out.println("B default");
        //A.super.c1();
    }
}
class C implements A{
    public void a1(){
        System.out.println("C a1");
    }
    public void b1(){
        System.out.println("C b1");
    }

    @Override
    public void c1() {
        A.super.c1();
    }
}
class interface1{
    public static void main(String[] args) {
        A obj1=new B();
        obj1.a1();
        obj1.b1();
        obj1.c1();

        A obj2=new C();
        obj2.a1();
        obj2.b1();
        obj2.c1();

    }
}*/

//Static method
//prg: 01 //Direct calling main method
/*interface interface1{
    public static void main(String[] args) {
        System.out.println("hii");
    }
}*/

//prg: 02 //Calling interface
/*interface A{
    public static void a() {
        System.out.println("Static method");
    }
}
    class interface1{
        public static void main(String[] args) {
            A.a();
        }
}*/

//prg: 03
/*interface A{
    public static void a1() {
        System.out.println("i m Static");
    }

    void show();
}

class B implements A{
    @Override
    public void show() {
        System.out.println("i m show");
    }
}
class interface1{
    public static void main(String[] args) {
        A.a1();

        B obj=new B();
        obj.show();
    }
}*/


//private method
//1st method

/*interface A {
    default void call() {
        add(4, 6);
    }

    private void add(int a, int b) {
        System.out.println(a+b);
    }
}

class B implements A {
    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

class interface1{
    public static void main(String[] args) {
        B obj = new B();
        obj.sub(5, 2);
        obj.call();
    }
}*/

//2nd method
/*interface A {
    public static void call() {
        add(4, 6);
    }

    private static void add(int a, int b) {
        System.out.println(a+b);
    }
}

class B implements A {
    public void sub(int a, int b) {
        System.out.println(a - b);
    }
}

class interface1{
    public static void main(String[] args) {
        B obj = new B();
        obj.sub(5, 2);
        A.call();
    }
}*/

