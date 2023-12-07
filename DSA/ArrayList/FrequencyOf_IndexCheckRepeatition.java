package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FrequencyOf_IndexCheckRepeatition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n= s.nextInt();
        System.out.println("Enter the element which you wanna check in Array: ");
        int x=s.nextInt();
        System.out.println("Enter the Element of Array: ");

        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(s.nextInt());
        }

        int occurence=Collections.frequency(al,x);
        int index=al.indexOf(x);

        System.out.println(occurence+" "+index);
    }
}
