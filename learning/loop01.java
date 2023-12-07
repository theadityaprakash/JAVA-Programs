package learning;

import java.util.Scanner;
public class loop01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*//1st program
        for(int i=0;i<15;i++){
            System.out.println(i);

        }*/

        /*//2nd program (using variable)
        int abc=0;
        int bcd=20;
        for(int i=abc;i<=bcd;i++){
            System.out.println(i);
        }*/

        /*//3rd program(using double and more than one increment)
        double hii=30;
        for(double i=0;i<=hii;i+=2){
            System.out.println(i);
        }*/

        /*String[] data=new String[7];
        data[0]="red";
        data[1]="blue";
        data[2]="green";
        data[3]="black";
        data[4]="white";
        data[5]="sky blue";
        data[6]="maroon";

       for(int i=0;i<data.length;i++){
            //System.out.println("Enter the value");
            //data[i]=scan.nextInt();

            if(data[i].equals("blue")){
                System.out.println("nice");

            }
            else{
                System.out.println("ok");
            }

        }*/

        /*//1st loop program

        int i=1;
        while(i<=5){
            System.out.println("hii");
            i=i+1;
        }*/

        /*//input take from user program
        System.out.println("enter the array");
        int txt= scan.nextInt();

        int i=1;
                while(i<=txt){
                    System.out.print("hii ");
                    i=i+1;
                }*/

        /*//3rd program
        int x=5;
        int y=5;

        while((x=5)==y){
            System.out.println("hii");
            x++;
            y++;
        }*/

        /*//4th program
        int x=5;
        int y=5;
        while(x==y){
            System.out.println("learning.hello");
            x++;
            y++;
        }*/

        /*//print n natural number by taking input from the user
        System.out.println("Enter the number");
        int txt = scan.nextInt();

        int i=1;
        while(i<=txt){
            System.out.print(i +" ");
            i++;
        }*/

        /*//sum of n natural number
        System.out.print("Enter the Number: ");
        int txt =scan.nextInt();

        int i=1;
        int sum=0;
        while(i<=txt){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);*/

        //prime number

        /*System.out.println("Enter a number");
        int n = scan.nextInt();

        int d = 2;
        while (d <= n - 1) {
            if (n % d == 0) {
                System.out.println("not a prime number");
                return;
            }

            d=d+1;
        }
        System.out.println("prime number");*/

        /* //int n=scan.nextInt();
        int a=20;
        int b=30;

        if(a++>20 && ++b>30){
            System.out.println("inside if");
        }
        else {
            System.out.println("inside else");
        }
        System.out.println("a" + a +"b" + b);*/

        //for loop
        System.out.println("Enter the value of n :");
        int n=scan.nextInt();
        int sum=0;
        for(int i=0; i<=n;i=i+1){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
