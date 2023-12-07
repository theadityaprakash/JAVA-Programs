package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverseOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of Array : ");
        int n=s.nextInt();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> l=new ArrayList<>();
            System.out.println("Enter the last Element of Array: ");
            int num=s.nextInt();
            for (int j = 1; j <= num; j++) {
                l.add(j);
            }
            System.out.println(l);
            Collections.sort(l, Collections.reverseOrder());
            System.out.println(l);
        }

    }
}
