package prepInsta;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
        System.out.println("Enter any number : ");
        int year=s.nextInt();


        //1st method
    if(year%400==0){
        System.out.println("leap year");
    }
    else if(year%4==0 && year%100!=0){
        System.out.println("leap year");
    }
    else {
        System.out.println("not a leap year");
    }


    //2nd method
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }


    //3rd method
        /*int temp;
    temp=year%400==0 || year%4==0 && year%100!=0 ? 1:0;
    if(temp==1){
        System.out.println("leap year");
    }
    else{
        System.out.println("not a leap year");
    }*/

    }
}
