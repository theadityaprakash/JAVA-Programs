package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayConstruction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Add automatically upto given Number or taken input
        /*int n=s.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(i);
        }
        System.out.println(al);*/

        //Insert element by taking user input
        int n=s.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
          int ele= s.nextInt();
          al.add(ele);
        }
        System.out.println(al);
    }
}
