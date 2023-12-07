package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class productRemoveNegative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        ArrayList<Integer> al=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int goal = s.nextInt();
            al.add(goal);
        }

        int neg_cout=0;
        int zero_count= Collections.frequency(al,0);

        if(zero_count>0){
            System.out.println(0);
        }
        else{
            int l=0;
            while (l< n){
                if(al.get(l)<0){
                    neg_cout=neg_cout+1;
                l++;
                }
                if(neg_cout%2==0){
                    System.out.println("0");
                }
                else {
                    System.out.println("1");
                }
            }
        }

    }
}
