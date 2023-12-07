package GFG.Array;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int temp=0;
        for (int i = 0; i <= n; i++) {
            temp=temp+i;
        }
        System.out.println(temp);
    }
}
