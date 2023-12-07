package prepInsta;

import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = s.nextInt();
        System.out.print("Enter the number : ");
        int num2 = s.nextInt();

        //for checking only 3 digit number
        /*int res,temp=0;
        while (num>0){
            res=num%10;
            temp=temp+(res*res*res);
            num=num/10;
        }
        if(temp==num1){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }*/

        /*int count=0;
        while(num1!=0){
            num1=num1/10;
            count++;

        }
        int num2=num,rem,arm=0;
        while(num2!=0){
            rem=num2%10;

            int mul=1;
            for(int i=1;i<=count;i++){
              mul=mul*rem;
            }
            arm=arm+mul;
            num2=num2/10;
        }
        if(num==arm){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("not Armstrong");
        }*/

        //Range of Armstrong Number

        for (int i = num1; i <= num2; i++) {
            int num = i;
            int count = 0;
            int numCopy = num;
            int arm = 0;

            // Calculate the number of digits in 'num'
            while (numCopy > 0) {
                numCopy /= 10;
                count++;
            }

            // Calculate the Armstrong number
            numCopy = num;
            while (numCopy > 0) {
                int digit = numCopy % 10;
                int mul = 1;

                for (int j = 1; j <= count; j++) {
                    mul *= digit;
                }

                arm += mul;
                numCopy /= 10;
            }

            // Check if 'arm' is equal to the original number 'num'
            if (arm == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }

         s.close();
    }
}

        //Re check the code its wrong
        /*for(int i=num;i<=num0;i++){
            int num4=i, num3=num4,count=0,arm=0;

            while(num3>0){
                num3=num3/10;
                count++;
            }
            int n,mul=1;
            while(num3>0){
                int temp=num3;
                n=temp%10;

                for(int j=1;j<=count;j++){
                   mul=mul*n;
                }
                arm=arm+mul;
                num3=num3/10;
            }
            if(arm==num3){
                System.out.println(num3);
            }
        }

    }
}*/
