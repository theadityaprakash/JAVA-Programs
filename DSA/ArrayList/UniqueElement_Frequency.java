package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueElement_Frequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());
        }

        HashSet<Integer> unique=new HashSet<>(a);
        ArrayList<Integer> srt= new ArrayList<>(unique);
        Collections.sort(srt);

        ArrayList<Integer> freq=new ArrayList<>();
        for (int i = 0; i < unique.size(); i++) {
            freq.add(Collections.frequency(a,srt.get(i)));
        }
        System.out.println(unique);
        System.out.println(freq);
    }
}
