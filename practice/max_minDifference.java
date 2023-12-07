package practice;

//Given 3 integers no1,no2,no3 you need to find the difference between the highest and the lowest of the given 3 integers.
import java.util.Scanner;

public class max_minDifference {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int no_case=s.nextInt();
        for(int i=0;i<no_case;i++){
            int no1=s.nextInt();
            int no2=s.nextInt();
            int no3=s.nextInt();

            int maximum= Math.max(no1,Math.max(no2,no3));
            int minimum= Math.min(no1,Math.min(no2,no3));
            int difference=maximum-minimum;
            System.out.println(difference);
        }
    }
}
