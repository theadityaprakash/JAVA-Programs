package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class holiday {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> a1=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a1.add(s.nextInt());
        }

        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(6,7,13, 14, 20, 21, 27, 28));
        a1.addAll(a);

        HashSet<Integer> unique=new HashSet<>(a1);
        System.out.println(unique.size());
    }
}
