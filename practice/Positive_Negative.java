package practice;

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=s.nextInt();

        if(num>0){
            System.out.println("Number is Positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("number is Equal to Zero");
        }
    }

}
