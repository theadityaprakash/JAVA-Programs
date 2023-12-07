package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class greatestElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());
        }

        int maxNum=a.get(0);
        int l=0;
        while (l<a.size()){
            if(maxNum<a.get(l)){
                maxNum=a.get(l);
            }
            l++;
        }
        System.out.println(maxNum);

    }
}
