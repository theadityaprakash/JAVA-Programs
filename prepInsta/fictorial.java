package prepInsta;

import java.util.Scanner;

public class fictorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();
        int num1=1;
        for(int i=1;i<=num;i++){
            num1=num1*i;
           // System.out.println(num1);
        }
        System.out.println(num1);
    }
}
