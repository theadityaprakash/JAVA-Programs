package GFG.Array;

import java.util.Arrays;

public class smallerLargerInArray {
    public static void main(String[] args) {
        int []a={2,14,1,5,13,8,4};
        int tar=7;
        int count=0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            if(a[i]>=tar){
                count++;
            }
        }
        System.out.println(count);
    }
}
