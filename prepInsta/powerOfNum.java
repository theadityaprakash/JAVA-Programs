package prepInsta;

import java.util.Scanner;

public class powerOfNum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();
        System.out.print("Enter the power of number : ");
        int pow = s.nextInt();

        int result=1;
        for (int i = 1; i <=pow; i++) {
            result=num*result;
        }
        System.out.println(result);
    }
}
