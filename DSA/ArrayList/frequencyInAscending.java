package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class frequencyInAscending {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(s.nextInt());
        }
        HashSet<Integer> set=new HashSet<>(al);
        for(int new1 : set){
            System.out.println(new1);
        }

        ArrayList<Integer> freq=new ArrayList<>();
        for(int newFreq: set){
            int count= Collections.frequency(al,newFreq);
            freq.add(count);
        }
        for( int count : freq){
            System.out.print(count+" ");

        }
        System.out.println();


    }
}
