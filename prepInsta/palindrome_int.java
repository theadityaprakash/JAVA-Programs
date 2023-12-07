package prepInsta;

import java.util.Scanner;

public class palindrome_int {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();
        int num1=num;

        int res,temp=0;
        while (num!=0){
            res=num%10;
            temp=temp*10+res;
            num=num/10;
        }
        if(temp==num1){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
