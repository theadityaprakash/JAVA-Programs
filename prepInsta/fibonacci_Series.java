package prepInsta;

import java.util.Scanner;

public class fibonacci_Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        int num1=0,num2=1;
        System.out.print(num1+" "+num2);
        int c;

        for(int i=1;i<=num;i++) {
            c=num1+num2;
            System.out.print(" "+c);
            num1=num2;
            num2=c;
        }
    }
}
