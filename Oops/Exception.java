package Oops;

import java.util.Scanner;

//public class Exception {

    //try and catch
    /*public static void main(String[] args) {

        try {
            int a = 13;
            int b = 0;
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("This is an Exception");
        }
    }*/

    /*public static void main(String[] args) {
        try{
            Class.forName("com.mySql.jdbc.Driver");
        }
        catch (java.lang.Exception e) {
            System.out.println(e);
        }
        System.out.println("fgfg");
        }*/

    //Compilar will only go into catch block when it will find and exception either it dont go
    /*public static void main(String[] args) {
        System.out.println("1");
        try{
            System.out.println("2");
            int a=110;
            int b=0;
            System.out.println("3");
            //System.out.println(a+b);
            System.out.println(a/b);
            System.out.println("4");
        }

        catch (java.lang.Exception e){
            System.out.println(e);
        }
        System.out.println("6");
    }*/

    //printing the exception
    /*public static void main(String[] args) {
        try{
            int a=20;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (java.lang.Exception e){
            //print only Exception name and discription
            System.out.println(e);
            System.out.println(e.toString());

            //print only discription
            System.out.println(e.getMessage());

            //print all three Exception name ,discription and Stack trace
            e.printStackTrace();
        }
    }*/

    //finally block

    //Type 1
    /*public static void main(String[] args) {
        try{
            int a=212 ,b=0 ,c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("i m finally");
        }
    }*/

    //Type 2   (it will Execute even if we not use catch block)
    /*public static void main(String[] args) {
        try{
            int a=212 ,b=0 ,c=a/b;
            System.out.println(c);
        }
        finally {
            System.out.println("i m finally");
        }
    }*/

    //Type 3 (Without any Exception)
    /*public static void main(String[] args) {
        try{
            int a=212 ,b=2 ,c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("i m finally");
        }
    }*/

    //Combination of try and catch
    //Type 1
    /*public static void main(String[] args) {
        try{
            int a=3;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (java.lang.Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("ok");
        }
    }*/

    //Type 2
    /*public static void main(String[] args) {
        try{
            int a=3;
            int b=0;
            int c=a/b;
            System.out.println(c);

            try{
                System.out.println("hi");
            }
            catch (java.lang.Exception e){

            }
            try{

            }
            catch (java.lang.Exception e){

            }


        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (java.lang.Exception e){
            System.out.println(e);

            try{

            }
            catch (java.lang.Exception e1){

            }
            try{

            }
            catch (java.lang.Exception e1){

            }
        }

        finally {
            System.out.println("hi");
            try{

            }
            catch (java.lang.Exception e1){

            }
            try{

            }
            catch (java.lang.Exception e1){

            }
        }
    }*/

    //Type 3
    /*void divide(){
        int a=123;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }

   //type 4
    public static void main(String[] args) {
        Exception obj=new Exception();
        try{
        obj.divide();
        }
        catch (java.lang.Exception e){
            System.out.println(e);
        }
        System.out.println("This sout only to know program is working or not");
    }*/

    //type 5        (type 4 anf type 5 boh are same you can handle exception anywhere)
    /*void divide(){
        try {
            int a = 123;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
         catch (java.lang.Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Exception obj=new Exception();
            obj.divide();

        System.out.println("This sout only to know program is working or not");
    }*/

//}


    //Use of throw keyword
    /*class YoungAgeException extends RuntimeException{
        YoungAgeException(String msg){
            super(msg);
        }
    }
    class Exception{
        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            int age=scan.nextInt();

            try {
                if (age < 18) {
                    throw new YoungAgeException("You are not Eligible foe vote");
                } else {
                    System.out.println("You can vote");
                }
            }
            catch (java.lang.Exception e){
                System.out.println(e);
            }
        }
}*/


//Use of Throws keyword

/*class readWrite{

    void readFile() throws FileNotFoundException{
        FileInputStream fis =new FileInputStream("d:/abc.txt");
    }
    void saveFile() throws FileNotFoundException{
        String s="abc";
        FileOutputStream fis =new FileOutputStream("d:/abc.txt");
    }
}
class Exception{
    public static void main(String[] args) {
        readWrite obj=new readWrite();
        try{
            obj.readFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try{
            obj.saveFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("this line is just for varification");
    }
}*/


//Customized unchecked Exceptions
 /*class UnderAgeException extends RuntimeException{
    UnderAgeException(){
        super("you can't vote");
    }
    UnderAgeException(String message){
        super(message);
    }
}
class Exception {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age= s.nextInt();
        try{
            if(age<18){
                throw new UnderAgeException();

            }
            else{
                System.out.println("you can vote");
            }
        }
        catch (UnderAgeException e){
            System.out.println(e);
        }
    }
}*/

//Customized checked Exceptions
/*class UnderAgeException extends ClassNotFoundException{
    UnderAgeException(){
        super("you can't vote");
    }
    UnderAgeException(String message){
        super(message);
    }
}
class Exception {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age= s.nextInt();
        try{
            if(age<18){
                throw new UnderAgeException();

            }
            else{
                System.out.println("you can vote");
            }
        }
        catch (UnderAgeException e){
            System.out.println(e);
        }
    }
}*/

class CharacterNotAllowedException extends ClassNotFoundException{
    CharacterNotAllowedException(String s1){
        super(s1);
    }
}

class Exception {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(System.in);
            char input = s1.next().charAt(0);
            if (input == 'A') {
                throw new CharacterNotAllowedException("Character 'A' not allowed");
            } else {
                System.out.println("valid character" +"  "+ input);
            }
        }
        catch(CharacterNotAllowedException e){
            System.out.println(e.getMessage());
        }

        }
    }






