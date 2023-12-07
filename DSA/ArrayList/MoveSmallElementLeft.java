package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*public class MoveSmallElementLeft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(s.nextInt());
        }

        int minNum=al.get(0);
        int minIndex=0;
        int l=0;
        while (l<al.size()){
            if(minNum>al.get(l)){
                minNum =al.get(l);
                minIndex=l;
            }
            l++;
        }
        int k=minIndex;
        while(k>0){
            Collections.swap(al,k,k-1);
            k=k-1;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(al.get(i));
        }
        System.out.println();
    }
}*/

public class MoveSmallElementLeft {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());
        }

        int minElement=a.get(0);
        int minIndex=0;
        int l=0;
        while (l<a.size()){
            if(minElement<a.get(l)){
                minElement= a.get(l);
                minIndex=1;
            }
            l++;
        }
        int k=minIndex;
      while (k>0){
          Collections.swap(a,k,k-1);
          k=k-1;
      }
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
        System.out.println();
    }
}
