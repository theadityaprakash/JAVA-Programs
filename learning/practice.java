package learning;

import java.util.Scanner;
public class practice {
    public static void main (String[] args) {
        String s2=new String("Aditya");
        System.out.println(s2.length());

    }
}
            /*Scanner s = new Scanner(System.in);
            int n=s.nextInt();

        for (int i = 0; i < n; i++) {
            int t1 = s.nextInt();
            int t2 = s.nextInt();
            int t3 = s.nextInt();

            int total = 4 * t1 + 2 * t2 + 0 * t3;

            System.out.println(total);


        }
    }
}*/
        /*Write a program that averages the synsets created for three months April, May and June. Declare and initialize variable to the synset entered for each month. Compute the average and write out the results, something like this:
        Synsets Entered for April: 12
        Synsets Entered for May : 14
        Synsets Entered for June: 8
        Average Synset Entered: 11.333333


        int april=15;
        int may=5;
        int june=6;
        double avg;
        avg=(april+may+june)/3;
        System.out.println("synsets of april"+april);
        System.out.println("Synsets  of may"+may);
        System.out.println("Synseet os june"+june);
        System.out.println("avarage synsets"+avg);

 //2nd program
        int a_number=1; (range is 1 to 5 both including)
       Print the value in a_number in word with and without using equality (= =) operator. For example it should print “Four” if a_number contains 4.


        Scanner scan=new Scanner(System.in);
        int a_number= scan.nextInt();


        if (a_number==1)
            System.out.println("one");
        if (a_number==2)
            System.out.println("two");
        if (a_number==3)
            System.out.println("three");
        if (a_number==4)
            System.out.println("four");
        if (a_number==5)
            System.out.println("five");
        //if (a_number<5)
        else
        System.out.println("number not find");


        //Compare integer using if else statement, rational operators

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1=scan.nextInt();

        System.out.println("Enter the second number");
        int num2=scan.nextInt();

        if(num1==num2){
            System.out.printf("%d==%d\n",num1,num2);
        }
        if(num1!=num2){
            System.out.printf("%d not %d\n",num1,num2);
        }
        if(num1>num2) {
            System.out.printf("%d>%d\n",num1,num2);
        }*/

        /*double[] txt = new double[3];
                txt[0]=1.7;
                txt[1]=8.0;
                txt[2]=6.4;

                double A=txt[1]+txt[2]-txt[0];
                System.out.println(A+txt[0]+txt[1]);*/

        /*int a=50;
        int b=Integer.MIN_VALUE;

        if(a/0==b){
            System.out.println("hii");
        }
        else{
            System.out.println("learning.hello");
        }*/

        /*int a=50;
        int b=20;
        if(a>b){

            if(a>100){
                System.out.println("hii");
            }
            if(b<100){
                //System.out.println("learning.hello");
                b=50;
            }
        }
        else if(a==b){
            System.out.println("ok");
        }
        else{
            System.out.println("go");
        }*/

        /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=scan.nextInt();

        int i=1;
        while(i<=n-1){
            int j=0;
            while(j<=n+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }*/

        /*Scanner txt=new Scanner(System.in);
        System.out.println("Enter the  value of n :");

        int n=txt.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }*/

        /*Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }*/

        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=scan.nextInt();

        int i=1;
        while(i<=n){

            int j=1;
            while(j<=n){
                System.out.print((char)('A'+j-1));
                //System.out.print("=");
                j++;
            }
            System.out.println();
            i++;
        }*/

        //reverse a number
        /*Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=scan.nextInt();
        int r;

        System.out.print("Reversed number: ");
        while(n>0){
            r=n%10;
            System.out.print(r);
            n=n/10;
        }*/

    //factorial using function

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
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        return n;
    }

    public static void main(String[] args) {
        int n = input();
        output(n);
    }*/
//Array

    /*public static void main(String[] args) {
        int[] arr=new int[10];
        arr[3]=10;
        arr[4]=11;
        char[] carr=new char[8];
        carr[2]='a';
        String[] sarr=new String[10];
        sarr[3]="adm";

        System.out.println(arr[3]+"\n"+carr[2]+"\n"+sarr[3]);
    }*/
