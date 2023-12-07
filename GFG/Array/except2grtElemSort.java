package GFG.Array;

import java.util.Arrays;

public class except2grtElemSort {
    public static void main(String[] args) {
        int []a={2,14,1,5,3,8,4};
        Arrays.sort(a);
        for (int i = 0; i < a.length-2; i++) {
            System.out.println(a[i]);
        }
    }
}
