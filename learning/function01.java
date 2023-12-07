package learning;

import java.util.Scanner;
public class function01 {

    //print the name
    /* public static void printName( String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name=scan.next();
        printName(name);


    }*/

    //add two number using function
    /* public static int newsum(int a,int b){
        int sum=a+b;
        return sum;
    }


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the number a: ");
        int a=scan.nextInt();
        System.out.print("Enter the number b: ");
        int b=scan.nextInt();

        int sum= newsum(a,b);
        System.out.print("sum (a+b): ");
        System.out.println(sum);

    }*/

    //Adding two number(taking input ,output and doing sum in all different function)
     public static int add(int num1,int num2){
        int sum=num1+num2;
        return sum ;
    }
    public static int input(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1=s.nextInt();
        System.out.println("enter the second number : ");
        int num2=s.nextInt();

        return add(num1,num2);

    }
    public static void output(){
        int sum=input();
        System.out.println(sum);
    }

    public static void main(String[] args) {

        output();

    }
}

    //practice of adding
    /*public static int sum(int a,int b){
        return a+b;
    }
    public static int input(){
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the number a: ");
        int a=scan.nextInt();
        System.out.print("Enter the number b: ");
        int b=scan.nextInt();

        return sum(a,b);
    }
    public static void output(){
        int out=input();
        System.out.println(out);
    }


    public static void main(String[] args) {
        output();
    }*/

    //product of two number
    /*public static int multiply(int a,int b) {
        int product=a*b;
        return product ;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter numb a : ");
        int a= scan.nextInt();
        System.out.print("Enter num b :");
        int b=scan.nextInt();

        int product = multiply(a,b);
        System.out.println("product of a*b : "+product);
    }*/

    /*public static int subs(int a,int b) {
        return a-b;

    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println("subtract : " + subs(a,b));
    }*/

    /* public static int okadi(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        int a=1;
        int b=2;

        int sum=okadi(a,b);
        System.out.println(okadi(a,b));
        //System.out.println(sum);
    }*/

    /*public static int sum01(int a,int b) {
        int sum=a-b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum=sum01(a,b);
        System.out.println(sum);

    }*/

    //factorial
    /*public static void hii(int n){

        if(n<0){
            System.out.println("Not a valid number");
            return;
        }
        int fact=1;
                for(int i=n;i>=1;i--){
                    fact=fact*i;
                }
        System.out.println(fact);
                return;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= scan.nextInt();

       hii(n);
    }*/

    /*public static void new01(long num) {
        if(num<0){
            System.out.println("not valid");
            return;
        }
        long fact=1;
        for(long i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number : ");
        long num=scan.nextLong();

        new01(num);
    }*/

    //learning.practice
    /* public static int cd01(int a, int b){
        int sum=a-b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();

        int sum=cd01(a,b);
        System.out.println(sum);
    }*/

    /*public static int abc(int a, int b) {
        return a + b;
    }
        public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();

            System.out.println(abc(a,b));


    }*/

    /* public static void table(int n){
        int sum=1;
        for(int i=1;i<=10;i++){
            sum=sum*i;

        }
        return ;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(n);
        table(n);
    }*/

    /* public static void abc(int n){
        for(int i=1;i<=10;i++){
            int sum=n*i;
            System.out.println(sum);
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        abc(n);
    }*/

    /* public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();

        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        int factr=1;
        for(int i=1;i<=b;i++){
            factr=factr*i;
        }
        int factnr=1;
        for(int i=1;i<=a-b;i++){
            factnr=factnr*i;
        }
        int sum=fact/(factr*factnr);
        System.out.println(sum);

    }*/

    /* public static int facto(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            int a= scan.nextInt();
            int b= scan.nextInt();

            int factN=facto(a);
            int factR=facto(b);
            int factNR=facto(a-b);

            int result=factN/(factR*factNR);
            System.out.println(result);

        }*/

    /*  public static int num(int a, int b) {
        return a + b;
//        int sum=a+b;
//        return sum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int sum = num(n, m);
//        num(n, m);
        System.out.println(sum);
    }*/

    /*public static void even(){
        for(int i=0;i<=100;i+=2){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        even();
    }*/

    /*public static void even(int n){
        for(int i=2;i<=n;i+=2){
            System.out.println(i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        even(n);
    }*/

    /* public static int num(int a ,int b){
        if(b==0){
            return Integer.MIN_VALUE;
            //Here we can also use try and catch method
        }
        int div=a/b;
    return div;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int div=num(n,m);
        System.out.println(div);
    }*/

    //need to check this one
    /*public static int num(int a ,int b){
        if(b==0){
            return Integer.MIN_VALUE;
        }
        int div=a/b;
        return div;
    }
    //..................
    public static int newsum(int a,int b){
        int sum=a+b;
        return sum;
    }
    //..................


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int div=num(n,m);
        System.out.println();
        //...........
        int newsum=num(n,m);
        System.out.println(div);
        //.........
    }*/

    /* public static void b() {
        // a();  //if we put this here then loop will continue and it results stacks overflow
        System.out.println("2");
    }
    public static void a(){
        b();
        System.out.println("1");
    }
    public static void main(String[] args) {
        a();
        System.out.println("main");
    }*/

    /* public static void c(int n) {
        System.out.println(n);
    }
    public static void b(int n) {
         c(n);
        System.out.println("b"+n);
    }
    public static void a(int n){
        b(n);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        a(n);
        System.out.println("main"+n);
        n++;
    }*/

    /* public static int abd(int n){
        n++;
        return n;
    }

    public static void main(String[] args) {
        int n=10;
       int a=abd(n);
        System.out.println(a);

    }*/

//QUESTIONS :
    //Enter 3 numbers from the user & make a function to print their average

   /* public static int num(int a,int b,int c){
        int avg= (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number a: ");
        int a = scan.nextInt();
        System.out.print("Enter the number b: ");
        int b = scan.nextInt();
        System.out.print("Enter the number c: ");
        int c = scan.nextInt();

        int avg=num(a,b,c);
        System.out.println("Average : "+avg);
    }*/

   /* public static double num(double a,double b,double c){
        double avg= (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number a: ");
        double a = scan.nextDouble();
        System.out.print("Enter the number b: ");
        double b = scan.nextDouble();
        System.out.print("Enter the number c: ");
        double c = scan.nextDouble();

        double avg=num(a,b,c);
        System.out.println("Average : "+avg);
    }*/

    //Write a function to print the sum of all odd numbers from 1 to n.
   /* public static void abc(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        return;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number a: ");
        int n = scan.nextInt();

        abc(n);

    }*/

    //practice

    /*public static void abc(int n){
        n++;
        System.out.println("function" + n);
    }


    public static void main(String[] args) {
        int n=10;
        abc(n);
        System.out.println("main"+ n);
    }*/

    /*public static void c(int n) {
        System.out.println("C"+n);
        n++;
        System.out.println("D"+n);
    }
    public static void b(int n) {
        c(n);
        System.out.println("BC"+n);
        n++;
    }
    public static void a(int n) {
        b(n);
        System.out.println("AB"+n);
        n++;
    }
    public static void main(String[] args) {
        int n=10;
        a(n);
        System.out.println("main"+n);
    }*/

    /*public static int abc(int n){
        n++;
        return (n);
    }
    public static void main(String[] args) {
        int n=10;
        n=abc(n);
        System.out.println(n);

    }*/


    //Adding of two number by taking input (input and output both concept)
    /* public static void print(int sum){
       System.out.println(sum);
   }
    public static int abc(){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int sum=n1+n2;
        //System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int sum=abc();
        print(sum);
    }*/

    //subtract by same concept
    /*public static void out(int sub){
        System.out.println(sub);
    }
    public static int inSub(){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int sub=n1-n2;
        return sub;
}
    public static void main(String[] args){
        int sub=inSub();
        out(sub);
    }*/

    //multiplication
    /*public static void out(int mult){
        System.out.println("Result: "+mult);
    }
    public static int inmult(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1=scan.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2= scan.nextInt();
        int mult=n1*n2;
        return mult;
    }

    public static void main(String[] args) {
        int mult=inmult();
        out(mult);
    }*/

    //Division
    /*public static void out(float div){
        System.out.println(div);
    }
    public static float indiv(){
        Scanner scan=new Scanner(System.in);
        float n1=scan.nextFloat();
        float n2=scan.nextFloat();
        float div=n1/n2;
        return div;
    }

    public static void main(String[] args) {
        float div=indiv();
        out(div);
    }*/

    //factorial
    /*public static void output(int n){
        if(n<0){
            System.out.println("its and invalid number");
            return;
        }
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static int input(){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int n=input();
        output(n);
    }*/

    //print code all char in different line using function
    /*public static void print(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        print(str);
    }*/


