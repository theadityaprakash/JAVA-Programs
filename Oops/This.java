package Oops;

//this keyword is used to invoke current class instance variable
/*class This{
    int i;
    void setValue(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        This obj=new This();
        obj.setValue(100);
        obj.show();
    }
}*/

//this keyword can be used to invoke current class method
/*class This{
    void show(){
        System.out.println("hiii");
    }
    void display(){
        this.show();             //this.show() and show() both are same thing.
         show();                // if you not add this keyword compiler can automatically invoke this keyword by itself
    }

    public static void main(String[] args) {
        This obj=new This();
        obj.display();
    }
}*/


//this() keyword is use to invoke current class constructor
/*class This{
    This(){
        System.out.println("hiii");
    }
    This(int i){
        this();
        System.out.println("i m int");
    }

    public static void main(String[] args) {
        This obj=new This(12);
    }
}*/


//this keyword is used to pass argument in the method call
/*class This{
    void a(This a1){
        System.out.println("hii a");
    }
    void b(){
        a(this);
        System.out.println("hello b");
    }

    public static void main(String[] args) {
        This obj=new This();
        obj.b();
    }
}*/

//this keyword is used to pass argument in the construction call
/*class test {
    test(This aa) {
        System.out.println("i m test");
    }
}
class This{
        void a(){
            test obj=new test(this);
        }

    public static void main(String[] args) {
        This obj2=new This();
        obj2.a();
    }
}*/

//this can be  used to return the current class instance from the method
class This{
    This a(){
       return this;
    }
    public static void main(String[] args) {
        This obj=new This();
        obj.a();
    }
}



/*public class This {
    private int Numb;
    public int getNumb(){
        return Numb;
    }
    public void setNumb(int Numb){
        if(Numb<=0){
            return;
        }
        this.Numb=Numb;
    }

    public static void main(String[] args) {
        This obj=new This();
        obj.setNumb(8989);
        System.out.println(obj.getNumb());
    }
}*/
