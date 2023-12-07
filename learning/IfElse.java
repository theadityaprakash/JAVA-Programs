package learning;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {

       /* System.out.println("Do you want to buy a car");
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();

        if (txt.equals("yes")) {
            System.out.println("which car do you want to buy red  green yellow");
            String txt1 = scan.next();

            if (txt1.equals("red")) {
                System.out.println("yes sir we have red car lets check");
            }
            else if (txt1.equals("green")) {
                System.out.println("yes sir we have that car");
            }
            else if (txt1.equals("yellow")) {
                System.out.println("yes we that car sir want to see it");

            }
            else {
                System.out.println("ok sir have a good deal");
            }
        }
        else
            {
                System.out.println("ok sir have a great day");
            }*/

       /* //2nd program
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name");
        String txt1= scan.next();

        System.out.println("Enter your age");
        int txt2= scan.nextInt();

        System.out.println("Enter your location");
        String txt3=scan.next();

        System.out.println("Enter your gender");
        String txt4=scan.next();

        if(txt4.equals("male")){
            System.out.println("What  colour car do you want to buy blue or green");
            String txt5=scan.next();

            if(txt5.equals("blue")){
                System.out.println("yes have that car sir");
            }
            else if (txt5.equals("green")){
                System.out.println("yes sir lets check the car");
            }

        }
       else if(txt4.equals("female")){
            System.out.println("What do you want to buy cosmetics or clothes");
            String txt6=scan.next();

            if(txt6.equals("cosmetics")) {
                System.out.println("yes have that lets check");
            }
            else if(txt6.equals("clothes"))
                System.out.println("ok maam lets check clothes");
        }

      else {
          System.out.println("hii there");
    }*/

       /* Scanner scan=new Scanner(System.in);

        System.out.println("Enter two number");
        int a,b;
        a= scan.nextInt();
        b=scan.nextInt();


        if(a>b){
            System.out.println("A is grater number");
        }
        else{
            System.out.println("B is greater number");
        }*/

       /*//even/ odd
        Scanner scan=new Scanner(System.in);

        double a;
        System.out.println("Enter a number");
        a= scan.nextDouble();

        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }*/

       /*//check numbers are positive
       Scanner scan = new Scanner(System.in);

       System.out.println("Enter the numbers A and B :");
       int a,b;
       a=scan.nextInt();
       b=scan.nextInt();

       if(a>0 && b>0 ){
           System.out.println("A and B are positive number");
       }
       else{
           System.out.println("both numbers are not positive");
       }*/

        /*Scanner scan=new Scanner(System.in);

       System.out.println("Enter the numbers A and B : ");
       int a,b;
       a= scan.nextInt();
       b= scan.nextInt();

         //if(a>0 || b>0) //or operator
         //if(a==b) //equal operator
        // if(a!=b) //unequal operator
        if((a^b)==a+b)
       {
           System.out.println("Atleast one number is positive :");
       }
       else{
           System.out.println("Both are negative");
       }*/

        /*Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name");
        String name= scan.next();
//totalSalary = basic + hra + da + allow – pf
        int basic,hra,da,pf;
        String allow= scan.next();

        System.out.println("Enter your basic salary");
        basic= scan.nextInt();

        System.out.println("enter your hra");
        hra=scan.nextInt();

        System.out.println("enter your da");
        da=scan.nextInt();

        //if(allow.equals("a"))
        String a= scan.next();
        String b= scan.next();
        if(allow==a)

        {
           System.out.println("allowance =1700");
        }
        else if (allow==b){

            System.out.println("allowance=2000");
        }
        else{
            System.out.println("Allowance=2500");
        }*/

        /*Scanner scan=new Scanner (System.in);
       System.out.println("Enter the Basic Salary");

       int basic= scan.nextInt();
       char grade=scan.next().charAt(0);

       double hra = 0.2*basic;
       double da = 0.5*basic;

       int allowance;

       if(grade=='A'){

          allowance=1700;
       }
       else if(grade=='B'){
           allowance=1800;
        }
       else{
           allowance=1500;
       }
       double pf=0.11*basic;
       double totalSalary= basic+hra+da+allowance-pf;
       int ans=(int) Math.round(totalSalary);
       System.out.println(ans);*/

        /* Scanner scan=new Scanner(System.in);

        System.out.println("Enter basic salary");
        int basic= scan.nextInt();
        char grade=scan.next().charAt(0);

        double hra=0.5*basic;
        double da=0.2*basic;

        int allowance;

        if(grade=='A'){
            allowance=2000;
        }
        else if(grade=='B'){
            allowance=1800;
    }
         else{
            allowance=1200;

    }
        double pf=0.11*basic;
        double totalSalary= basic+hra+da+allowance-pf;
        //double totalSalary=basic +allowance;
        int ans=(int) Math.round(totalSalary);
        System.out.println(ans);*/

        /*Scanner scan=new Scanner(System.in);

        System.out.println("Enter the Character :");
        String s= scan.next();
        char ck =s.charAt(0);

        if(ck>='A'&&ck<='Z'){
            System.out.println("its a capital letter");
        }
        else if(ck>='a'&&ck<='z'){
            System.out.println("this letter is small");
        }
        else{
            System.out.println("none");
        }*/

        /*Scanner scan=new Scanner(System.in);
        int no1=180;
        int no2=20;
        if(no1>no2)
            System.out.println("no1 is greater");
        else
            System.out.println("no2 is greater");*/

        int no1=180;
        int no2=20;
        if(no1>no2) {
            System.out.println("no1 is greater");
            System.out.println("no1 is greater then no2");
        }
        else
            System.out.println("no2 is greater");

    }
}
