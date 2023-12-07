package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removeNegative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        ArrayList<Integer> al=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int goal = s.nextInt();
            al.add(goal);
        }
        int l=0;
        int temp=0;
        while(l<al.size()) {
            if (al.get(l) < 0) {
                temp = temp + 1;
            }
            l++;
        }
        System.out.println(temp);
    }
}
