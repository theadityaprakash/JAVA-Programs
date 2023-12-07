package Oops;

    /*class demo{
    int id;
    int salary;
    static String ceo;
    static String ceeo="Sumedha";


public void show(){
    System.out.println(id+"\n"+salary+"\n"+ceo);
    }
}

public class statics {
    public static void main(String[] args) {
        demo obj1=new demo();
        obj1.id=10;
        obj1.salary=40000;
        obj1.ceo="Aditya";
        demo.ceo="Aditya";

        demo obj2=new demo();
        obj2.id=12;
        obj2.salary=50000;
         obj2.ceo="Aditya";

        demo.ceo="Aditya";
       // demo.ceeo="";
       // obj2.ceo="Adity";

        obj1.show();
        obj2.show();
    }
}*/

    /* public class statics {
    public String name;
    final private int rollNumber;
    static int numStudents;

    public statics(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
        numStudents++;
    }


    public static void main(String[] args) {
        System.out.println(statics.numStudents);

        //there is no need to create object in static variable
        statics obj1=new statics("adi",1);
        statics obj2=new statics("abc",2);
        statics obj3=new statics("xyz",3);

        //this is not the correct method of declearing of static variable
        System.out.println(obj1.numStudents);
        System.out.println(obj2.numStudents);
        System.out.println(obj3.numStudents);

        //This is the correct way to declear direct be class name
        System.out.println(statics.numStudents);
        System.out.println(statics.numStudents);
        System.out.println(statics.numStudents);

    }

}*/

    /*public class statics {
    public String name;
    final private int rollNumber;
   private static int numStudents;

    public statics(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
        numStudents++;
    }

    public statics(){
        name="abc";
        numStudents++;
        this.rollNumber=numStudents;
    }

    public static int getNumStudents(){
        return numStudents;
    }


    public static void main(String[] args) {
       // System.out.println(statics.getnumStudents());

        /**

         System.out.println(statics.numStudents);

         //there is no need to create object in static variable
         statics obj1=new statics("adi",1);
         statics obj2=new statics("abc",2);
         statics obj3=new statics("xyz",3);

         //this is not the correct method of declearing of static variable
         System.out.println(obj1.numStudents);
         System.out.println(obj2.numStudents);
         System.out.println(obj3.numStudents);

         //This is the correct way to declear direct be class name
         System.out.println(statics.numStudents);
         System.out.println(statics.numStudents);
         System.out.println(statics.numStudents);


        statics obj1=new statics("abc",2);
        statics obj2=new statics("xyz",3);

        System.out.println(obj1.getnumStudents());
        System.out.println(obj2.getnumStudents());**/
   /* }

}*/


//we can access static variable directly through class
/*class test{
    static int a=10;
}
class statics{
    public static void main(String[] args) {
        System.out.println(test.a);
    }
}*/

//Static can be used for memory management
/*class statics{
    int email_id;
    String name;
    static String company="Travel Buddy";  //here company name is same for all the employee so we put company name in static varible
                                          //so to save the space we use static method it refers this static variable in all object.
                                          //static variable gets memory only once in the class at the time of class loading.
    statics(int email_id, String name){
        this.email_id=email_id;
        this.name=name;
    }
    void display(){
        System.out.println(email_id+" "+name+" "+company);
    }

    public static void main(String[] args) {
        statics e1=new statics(101,"aditya");
        e1.display();
        statics e2=new statics(102,"sumedha");
        e2.display();
        statics e3=new statics(103,"suman");
        e3.display();
        statics e4=new statics(104,"sanjeev");
        e4.display();
    }
}*/

//to keep the count of how many object created
/*class statics{

    static int count=0;
    statics(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        {
            statics c1=new statics();
            statics c2=new statics();
            statics c3=new statics();
        }
    }

}*/