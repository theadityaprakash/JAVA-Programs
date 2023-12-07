package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class swapElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());
        }
        int index=3;
        for (int i = 0; i < n; i++) {
            Collections.swap(a,index,index-1);
            System.out.println(a);
        }


    }
}
