package learning;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        //Square pattern

        /*//pattern ****
              //  ****
        //        ****
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n :");

        int n= scan.nextInt();

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

        /*//pattern 1111
               //   2222
                //  3333
        Scanner txt0=new Scanner(System.in);
        System.out.println("Enter the value of n :");

           int n= txt0.nextInt();

           int i=1;
           while(i<=n){

               int j=1;
               while(j<=n){
                   System.out.print(i);
                   j++;
               }
               System.out.println();
               i++;

           }*/

        /*//pattern 1234
        //          1234
        //          1234

        Scanner txt=new Scanner(System.in);
        System.out.println("Enter the  value of n :");

        int txt1=txt.nextInt();

        int i1=1;
        while(i1<=txt1){
            int j1=1;
            while(j1<=txt1){
                System.out.print(j1);
                j1++;
            }
            System.out.println();
            i1++;
        }*/

        //Triangle pattern

       /* //1st triangle pattern numbric trianngle 1
        //                                       22
        //                                       333
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the value of n :");

        int n=s.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }*/

         /*//3rd program numbric triangle pattern
        //1
        //23
        //345
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=num.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            int newNumb=i;
            while(j<=i) {

                System.out.print(newNumb);
                newNumb++;
                j++;
            }
            System.out.println();
            i++;
        }*/

        /* //4th program numbric 1-10 triangle
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=scan.nextInt();

        int i=1;
        int k=i;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(k);
                k++;
                j++;
            }
            System.out.println();
            i++;
        }*/

        //Character Square pattern
        /*Scanner sca=new Scanner(System.in);
        System.out.println("Enter the n :");
        int n= sca.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print((char) ('A' +j-1) );
                j++;
            }
            System.out.println();
            i++;
        }*/

        //2nd patter alphabet square pattern
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= scan.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            char n1=(char)('A'+ i-1);
            while(j<=n){
                System.out.print(n1);
                n1=(char)(n1+1);
                j++;
            }
            System.out.println();
            i++;
        }*/

        //1st char triangular pattern
        /*Scanner scn=new Scanner(System.in);
        System.out.println("Enter the value of  n:");
        int n=scn.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while (j<=i){
                System.out.print((char)('A'+i-1));
                j++;
            }
            System.out.println();
            i++;
        }*/

        /*//triangle pattern alphabatic triangle
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of  n:");
        int n=scan.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            char n1=(char)('A'+i-1);
            while (j<=i){
                System.out.print(n1);
                n1=(char)(n1+1);
                j++;
            }
            System.out.println();
            i++;
        }*/

        //Reverse triangle pattern
        //Scanner scan=new Scanner(System.in);
        /*System.out.println("Enter the number n :");
        //int n= scan.nextInt();

        int n=4;
        int i=1;
        while(i<=n){

            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int j1=1;
            while(j1<=i) {
                System.out.print("*");
                j1++;
            }
            System.out.println();
            i++;
        }*/

        //inverted triangle
        /*Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number n:" );
        int n=scan.nextInt();
        //int n=3;

        int i=1;
        while(i<=n){
            int j=1;
            while (j<=n-i+1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }*/

        /*Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=scan.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i) {
                System.out.print(" ");
                j++;
            }
                int j1=1;
                while(j1<=i){
                System.out.print("*");
                j1++;
            }
            System.out.println();
            i++;
        }*/

        /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n=scan.nextInt();

        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i) {
                System.out.print(" ");
                j++;
            }
                int j1=1;
                while(j1<=i){
                    System.out.print(j1);
                    j1++;
                }
            System.out.println();
            i++;
        }*/

                   //pattern using for loop

        //Star square/rectangle pattern
        /* System.out.println("Enter the no. length Element : ");
        int a= scan.nextInt();
        System.out.println("Enter the no. width Element");
        int b= scan.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        // star hollow square/rectangle pattern
        /*System.out.println("Enter the no. length Element : ");
        int a= scan.nextInt();
        System.out.println("Enter the no. width Element");
        int b= scan.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){

                if(i==1||j==1||i==a||j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        //star triangle (half piramid) |\
        /*System.out.println("Enter the number");
        int n= scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //star inverted triangle  |-/
        /*System.out.println("Enter the number");
        int n= scan.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Triangle  /|
        /* System.out.println("Enter the number :");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //triangle with number (12  123  1234....)
        /*System.out.println("Enter the number :");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            }*/

        //inverted triangle with number (1234  123  12....)
        /*System.out.println("Enter the number :");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        //triangle with number(1234....")(floyd's triangle)
        /*System.out.println("Enter the number :");
        int n= scan.nextInt();
        int numb=1;

        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(numb);
                numb++;
            }
            System.out.println();
        }*/

        //triangle using binary (101010101.....)
        /*System.out.println("Enter the number");
        int n= scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){   //even
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }*/

        //Butterfly pattern
        /*System.out.println("Enter the number");
        int n= scan.nextInt();

        //upper part

        for(int i=1;i<=n;i++) {
            //for left side triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //for space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //for right side triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


                //for lower side

            for(int i=0;i<n;i++){

                //for left side
                for(int j=n;j>i;j--) {
                    System.out.print("*");
                }

                //for space
                int space=2*i;
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }

                //for right side triangle
                for(int j=n;j>i;j--) {
                    System.out.print("*");
                }
                System.out.println();
        }*/

        //Using for loop (practice)

        //Triangle of 123.. |\
        /*int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        //Triangle of * |\
        /*int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Triangle 1 22 333 |\
        /*int n= scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }*/

        //Triangle * |-/

        /*int n= scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print("*");
                //System.out.print(j);
            }
            System.out.println();
        }*/


        //Triangle /|
        int n= scan.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
