package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class smallestElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());
        }
        int minNum=a.get(0);
        int l=0;
        while (l<a.size()){
            if(minNum>a.get(l)){
                minNum= a.get(l);
            }
            l++;
        }
        System.out.println(minNum);

    }
}
