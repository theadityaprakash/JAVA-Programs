package prepInsta;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();

        int num1=num;
        int count=0;
        while (num1>0){
            num1=num1/10;
            count++;
           //System.out.println(count+"----");
            int num2=1, sum=0;
            for(int i=1;i<=count;i++){
                num2=num2*i;

               /* int num3=num2;
                sum=sum+num3;
                num3=num3/10;*/

           }
            System.out.println(sum);

        }
    }
}
