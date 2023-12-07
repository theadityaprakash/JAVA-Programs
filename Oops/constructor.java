package Oops;

/*public class constructor {
public int id;

public constructor(int id){
    this.id=id;
}

    public static void main(String[] args) {
        constructor c1=new constructor(1);
        System.out.println(c1.id);
    }*/


        /*public String name;
    public int id;

    public constructor(String name,int id){
        this.name=name;
        this.id=id;

    }

    public static void main(String[] args) {
        constructor c1=new constructor("adi",12);
        constructor c2=new constructor("sumedha",4);

        System.out.println(c1.name+" "+c1.id);
        System.out.println(c2.name+" "+c2.id);
    }*/

    //How to check default construction created
    /*int i;

    public static void main(String[] args) {
        constructor s=new constructor();
        System.out.println(s.i);
    }*/

    //no argument constructor
    /*public constructor(){
        System.out.println("it's a no argument constructor");
    }

    public static void main(String[] args) {
        constructor s=new constructor();
    }*/

    //Argument constructor
    /*public constructor(int i){
        System.out.println("this is a parametrized constructor");
    }

    public static void main(String[] args) {
        constructor c=new constructor(10);
    }*/




        /*public String name;
        private int rollNumber;

        //we can use constructor in many way

    //1st way in which we can take all value in object
        /*public constructor(String n,int num) {
            name = n;
            rollNumber = num;
        }                                            //here we use comment for commenting this class

    //using this keyword
    public constructor(String name,int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    //2nd way in which we can take one value and assign other value
    public constructor(String n){
        name=n;
        rollNumber =111;
    }
    //3rd way in which we can assign all value
    public constructor(){
        name="Sumedha";
        rollNumber=166;
    }
        public int getrollNumber(){
            return this.rollNumber;
        }

        public void setrollNumber(int rollNumber){
            if(rollNumber<=0){
                return;
            }
        }


    public static void main(String[] args) {
        constructor s1=new constructor("Aditya" ,12);
        constructor s2=new constructor("Adi",14);
        constructor s3=new constructor("adi");
        constructor s4=new constructor();

        System.out.println(s1.name +" "+s1.getrollNumber());
        System.out.println(s2.name +" "+s2.getrollNumber());
        System.out.println(s3.name +" "+s3.getrollNumber());
        System.out.println(s4.name +" "+s4.getrollNumber());


    }*/

        /*private int numXyz;
          private String strXyz;

public constructor(String strXyz,int numXyz){
    this.numXyz=numXyz;
    this.strXyz=strXyz;
    }

    public constructor(){
    strXyz="adi";
    numXyz=22;
    }



    public int getnumXyz() {
        return numXyz;
    }

    public void setnumXyz(int numXyz) {
        this.numXyz = numXyz;
    }

    public String getstrXyz() {
        return strXyz;
    }

    public void setstrXyz(String strXyz) {
        this.strXyz = strXyz;
    }


    public static void main(String[] args) {
        constructor obj=new constructor("assd",32);
        constructor obj1=new constructor();

        System.out.println(obj.getnumXyz()+ " "+ obj.getstrXyz() + "\n" +obj1.getstrXyz()+" "+obj1.getnumXyz());
    }*/

        /*private int nu;

     constructor(int nu){
        this.nu=nu;
    }

    void setnu(int nu){
        this.nu=nu;
    }
    int getnu(){
        return nu;
    }

    public static void main(String[] args) {
        constructor obj=new constructor(2);
        System.out.println(obj.getnu());
    }*/

        /*public String name;
    public int roll;
    public constructor(String name,int roll){
        this.name=name;
        this.roll=roll;
    }

    public static void main(String[] args) {
        constructor s1=new constructor("ram",108);
        System.out.println(s1.name+" "+s1.roll);
    }*/

public class constructor{

   public int id;
    public constructor(int id){
        this.id=id;
       // System.out.println("hi");
}

    public static void main(String[] args) {
        constructor obj=new constructor(78);
        System.out.println(obj.id);
    }


}