package prepInsta;

import java.util.Scanner;

public class Sum1st_n_Numb {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter number : ");
        int num= scan.nextInt();

        //1st method
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);

        //2nd method
        System.out.println((num*(num+1))/2); //formula of sum of n natural number :  sum=( N * ( N + 1 )) / 2

        //3rd method (using recursion)

                int sum1 = getSum (num);
                System.out.println (sum1);
            }
            static int getSum (int num)
            {
                if (num == 0)
                    return num;
                return num + getSum (num - 1);
    }
}
