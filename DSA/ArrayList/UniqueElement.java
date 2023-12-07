package DSA.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(s.nextInt());
        }

        HashSet<Integer> unique=new HashSet<>(al);
        for (int num: unique) {
            System.out.println(num);
        }
        System.out.println();
    }
}
