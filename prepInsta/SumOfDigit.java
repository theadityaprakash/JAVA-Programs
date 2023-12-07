package prepInsta;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        int rem,sum=0;
        while (num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
            System.out.println(sum+"----");
        }
        System.out.println(sum);

    }
}
