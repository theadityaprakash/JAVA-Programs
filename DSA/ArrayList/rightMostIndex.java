package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class rightMostIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());
        }

        int max=-100;
        int index=0;
        int l=0;
        while (l<a.size()){
            if(max<=a.get(l)){
                max=a.get(l);
                index=l;
            }
            l++;
        }

        System.out.println(max+" "+index);
    }
}
