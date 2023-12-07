package prepInsta;

import java.util.Scanner;

//Sum of numbers in a given range
public class sumNumGivenRange {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int firstNum= scan.nextInt();
        System.out.print("Enter 2nd number : ");
        int SecondNum= scan.nextInt();

        //1st method
        int sum=0;
        for(int i=firstNum;i<=SecondNum;i++){
            sum=sum+i;
        }
        System.out.println(sum);


        //2nd method
        //using formula sum = b*(b+1)/2 – a*(a+1)/2 + a.
        System.out.println(((SecondNum*(SecondNum+1)/2)-((firstNum*(firstNum+1))/2))+firstNum);
    }
}
