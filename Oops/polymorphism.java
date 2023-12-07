package Oops;

//method overloading
//public class polymorphism {

    /*void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj=new polymorphism();
        obj.show();
        obj.show(10);
    }*/

    //Number of argument
    /*void show(int a,int b){         //Here is 2
        System.out.println("1");
    }
        void show(int a){                //Here is 1
        System.out.println("2");
    }

        public static void main(String[] args) {
        polymorphism obj=new polymorphism();
        obj.show(16,4);
        obj.show(10);
    }*/

    //Sequence of argument
    /*void show(char a,int b){
        System.out.println("1");
    }
    void show(int a,char b){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj=new polymorphism();
        obj.show('s',1);
        obj.show(10,'y');
    }*/

    //Type of argument
    /*void show(int a){
        System.out.println("1");
    }
    void show(char a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj=new polymorphism();
        obj.show(1);
        obj.show('K');
    }*/

    //Overloading main method
    /*public static void main(String[] args) {
        System.out.println("1");
        polymorphism obj=new polymorphism();
        obj.main(1);
    }

    public static void main(int a) {
        System.out.println("2");
    }*/

    //Automatic promotion
    /*void show(int a){
        System.out.println("1");
    }
    void show(String a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj=new polymorphism();
        obj.show('C');
        obj.show("abc");
    }*/

    //use of object class as data type
    /*void show(Object a){
        System.out.println("1");
    }
    void show(String a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        obj.show('C');
        obj.show("abc");

    }*/

    //when we have child class input then  it will call child class
    //it will only promote to parent class
    //it will only promote when it not find child class preference
    /*void show(Object a) {
        System.out.println("1");
    }

    void show(String a) {
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        //obj.show('C');
        obj.show("abc");
    }*/


    //String Buffer concept
    /*void show(StringBuffer a){
        System.out.println("1");
    }
    void show(String b){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj=new polymorphism();
        obj.show("xyz");
        obj.show(new StringBuffer("abc"));
        // we can't use null here because compiler get confused whom to call
        //obj.show(null);
    }*/

    //Oprations with 2 data type

    /*void show(int a,float b){
        System.out.println("1");
    }
    void show(float c, int d){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj=new polymorphism();
       // obj.show(7,4);  //Data type promotion is not allow when we are using 2 data type at once
        obj.show(6.3f,1);
        obj.show(3,4.1f);
    }*/

     //vararg method
     /* void show(int a)
      {
        System.out.println("1");
    }
        void show(int... a){                //this is a varargs method in which it takes multiple input
        System.out.println("2");
    }

        public static void main(String[] args) {
            polymorphism obj = new polymorphism();
            obj.show(1, 20, 43);
            obj.show(10);
            obj.show();  //this will also call varargs method
        }*/
//}

    //======== Overridding Method =======

/*class test{
    void show(){
        System.out.println("1");
    }
}
class polymorphism extends test{
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj1=new polymorphism();
        obj1.show();

        test obj2=new test();
        obj2.show();
    }
}*/

//Argument(same for overriding method)

//num. of argument (same)
/*class test{
    void show(int a, int b){
        System.out.println("1");
    }
}
class polymorphism extends test{
    void show(int c,int d){     //we can't do void show (int c,int b,int e) like
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj1=new polymorphism();
        obj1.show(2,4);

        test obj2=new test();
        obj2.show(3,8);
    }
}*/

//sequence will be same
/*class test{
    void show(String a,int s){
        System.out.println("1");
    }
}
class polymorphism extends test{
    void show(String v,int f){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj1=new polymorphism();
        obj1.show("df",2);

        test obj2=new test();
        obj2.show("sds",4);
    }
}*/

//types of arguments will be same
/*class test{
    void show(String a){
        System.out.println("1");
    }
}
class polymorphism extends test{
    void show(String v){
        System.out.println("2");
    }

    public static void main(String[] args) {
        polymorphism obj1=new polymorphism();
        obj1.show("df");

        test obj2=new test();
        obj2.show("sds");
    }
}*/


//using Different return type
/*class test{
    Object show(){
        System.out.println("1");
        return null;
    }
}
class polymorphism extends test{
    String show(){
        System.out.println("2");
        return null;
    }

    public static void main(String[] args) {
        test obj=new test();
        obj.show();

        polymorphism obj1=new polymorphism();
        obj1.show();
    }
}*/

//using different Access modifier
/*class test{
    protected void show(){
        System.out.println("1");
    }
}
class polymorphism extends test{
     public void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        test obj=new test();
        obj.show();

        polymorphism obj1=new polymorphism();
        obj1.show();
    }
}*/


//using different Access Modifier with different return type
/*class test{
    protected Object show(){
        System.out.println("1");
        return null;
    }
}
class polymorphism extends test{
    public String show(){
        System.out.println("2");
        return null;
    }

    public static void main(String[] args) {
        test obj=new test();
        obj.show();

        polymorphism obj1=new polymorphism();
        obj1.show();
    }
}*/

//Overriding and Exception handling

//Same exception
/*class test{
    void show() throws ArithmeticException
    {
        System.out.println("1");
    }
}
class polymorphism extends test{
    void show() throws ArithmeticException
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        test obj=new test();
        obj.show();

        polymorphism obj1=new polymorphism();
        obj1.show();
    }
}*/

//Different Exception but
/*class test{
    void show() throws RuntimeException
    {
        System.out.println("1");
    }
}
class polymorphism extends test{
    void show() throws Exception
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        test obj=new test();
        obj.show();

        polymorphism obj1=new polymorphism();
        obj1.show();
    }
}*/

//if parent class does not throw Exceptions then child does not throw checked Exception it always throw unchecked Exceptions
/*class test{
    void show()
    //void show() throws ArithmeticException  //cant do this
    {
        System.out.println("1");
    }
}
class polymorphism extends test{
    void show() throws ArithmeticException
    //void show() throws Exception         //cant do this
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        test obj=new test();
        obj.show();

        polymorphism obj1=new polymorphism();
        obj1.show();
    }
}*/
class A{
    void show(){
        System.out.println("AA");
    }
}
class B extends A{
    void show(){
        System.out.println("BB");
    }
}
class polymorphism extends B{
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        B obj1=new B();
        obj1.show();

        polymorphism obj2=new polymorphism();
        obj2.show();

    }
}