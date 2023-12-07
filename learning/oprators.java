package learning;

import java.util.Scanner;
public class oprators {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       /* int a=40;
        int b=56;
        double c=7.4;
        double h=5.6;
        int d= 50;
        int e=60;
        int f=53;
        int g=60;*/

        //boolean typ1=a<=b&&b>g;

        //System.out.println(a++);  //pre increment--> if a=40 ===>a=40 after that next time it will be 41
        //System.out.println(++a);  //pre increment--> if a=40 ===>a=41

       /* pre increment

       if(a++>40&&b++>56){
            System.out.println("in the if");
        }
        else{
            System.out.println("in else");
        }
        System.out.println("a" + a + "b" + b);*/

        /* post increment

        if(++a>40&&++b>56){
            System.out.println("in the if");
        }
        else{
            System.out.println("in else");
        }
        System.out.println("a" + a + "b" + b);*/

        /*Sum and product solution
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int choice=scan.nextInt();

    if(choice==1){
        int sum=0,num=1;
        while(num<=n){
            sum+=num;
            num++;
        }
        System.out.println(sum);
    }

    else if(choice==2){
        int product=1,num=1;
        while(num<=n){
            product*=num;
            num++;
        }
        System.out.println(product);
        }
    else{
        System.out.println("-1");
    }*/

        /*int n= scan.nextInt();
        int count=1,current=1;

        while(count<=n){
            int num=3*current+2;
            if(num%4!=0){
                System.out.println(num +" ");
                count++;
            }

            current++;
        }*/

        //Bitwise Opreation
        /*
        System.out.println(2&3); //bitwise AND
        System.out.println(2|3); //bitwise OR
        System.out.println(2^3); //bitwise XOR
        System.out.println(~2);  //bitwise NOT

        System.out.println(40<<1); //bitwise left shift
        System.out.println(40>>2); //bitwise right shift
        System.out.println(-4<<1); //bitwise left shift with negative number
        System.out.println(-4>>2); //bitwise right shift with negative nmber*/


    }
}