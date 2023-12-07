package Oops;
/*class A1{
    int i=10;
}
class super01 extends A1 {
    int i=20;
    void show(int i) {
        System.out.println(i);
    }
    void show() {
        System.out.println(this.i);
    }
        void show1(){
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        super01 obj=new super01();
        obj.show(30);
        obj.show();
        obj.show1();
    }
}*/

//super can use to refer immediate parents class instance variable
/*class A2{
    int a=12;
}
class super01 extends A2{
    int a=10;
    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        super01 obj=new super01();
        obj.show(30);
    }
}*/


//super can be used to invoke immediate parent class method

/*class A3{
    void show1(){
        System.out.println("i m show");
    }
}
class super01 extends A3{
    void show(int a){
        super.show1();
    }

    public static void main(String[] args) {
        super01 obj=new super01();
        obj.show(1);
    }
}*/


//using super in method overriding
/*class A3{
    void show(){
        System.out.println("i m show in A3");
    }
}
class super01 extends A3{
    void show(){
        System.out.println("i m show in super01");
    }
    void display(){
        show();             //for child class (super01)
        this.show();       //for child class (super01)
        super.show();      //for parents class (A3)
    }

    public static void main(String[] args) {
        super01 obj=new super01();
        obj.display();
    }
}*/

//super can we invoke immediate parent class constructor

class A4{
 A4(){
     System.out.println("hii i m constructor A4");
 }
}

class super01 extends A4{
    super01(){
        super();      //Write it or not it will call A4 automatically
        System.out.println("hii in m constructor super01");
    }

    public static void main(String[] args) {
        super01 obj=new super01();
    }
}



























