package prepInsta;

import java.util.Scanner;

public class NumOfDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();
        int num1=num;
        int count=0;
        while(num1>0){
            num1=num1/10;
            count++;
        }
        System.out.println(count);
    }
}
