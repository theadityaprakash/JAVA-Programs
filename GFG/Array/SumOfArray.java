package GFG.Array;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a={3,2,5,6};
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            temp=temp+a[i];
        }
        System.out.println(temp);
        System.out.println(Arrays.stream(a).sum());  //function to return Array sum
    }
}
