package prepInsta;

import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number : ");

        int num=s.nextInt();

        if(num>0){
            System.out.println("number is Positive");
        } else if (num==0) {
            System.out.println("it is zero");
        }
        else{
            System.out.println("its a negative number");
        }
    }
}
