package array02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraySort {
    public static void main(String[] args) {
        int[] a = {20, 30, 1, 23, 43,21,4};

        //1st method
       /* for (int i = 0; i < a.length; i++) {
            Arrays.sort(a);
            System.out.print(a[i]+" ");
        }*/

        //2nd method

        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
