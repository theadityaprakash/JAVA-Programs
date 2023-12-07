package prepInsta;

import java.util.Scanner;

public class greatest_in3_digit {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int firstNum= scan.nextInt();
        System.out.print("Enter 2nd number : ");
        int secondNum= scan.nextInt();
        System.out.print("Enter 3rd number : ");
        int thirdNum= scan.nextInt();

        //1st method
        if(firstNum<secondNum&&secondNum>thirdNum){
            System.out.println("its second number is greater");
        } else if (firstNum>secondNum&&firstNum>thirdNum) {
            System.out.println("its first number");
        }
        else{
            System.out.println("3rd number is greater");
        }

        //2nd method

        int temp,result;
        temp=firstNum>secondNum ? firstNum:secondNum;
        result=temp>thirdNum ? temp:thirdNum;

        System.out.println(result);
    }
}
