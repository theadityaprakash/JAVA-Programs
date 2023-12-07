package prepInsta;

import java.util.Scanner;

public class greatest_in_2_Num {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int firstNum= scan.nextInt();
        System.out.print("Enter 2nd number : ");
        int secondNum= scan.nextInt();

        if(firstNum==secondNum){
            System.out.println("its equal");
        }
        else if (firstNum>secondNum) {
            System.out.println("1st is greater");
        }
        else {
            System.out.println("second is greater");
        }


        //Using Ternary Operator
        int temp;
        if(firstNum==secondNum){
            System.out.println("both are equal");
        }
        else{
            temp=firstNum>secondNum ? firstNum:secondNum;
            System.out.println(temp);
        }

        //using inbuilt max function
        if(firstNum==secondNum){
            System.out.println("both are equal");
        }
        else{
            System.out.println(Math.max(firstNum,secondNum));
        }

    }
}
