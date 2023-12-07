package GFG.Mathematics;

import java.util.Arrays;

public class medianOfArray {
    static Integer calculation(int[] v){
        Arrays.sort(v);

        int n = v.length;
        int med = 0;
        if(n%2==0){
            med = (v[n/2]+v[(n/2)-1])/2;
        }else{
            med = v[n/2];
        }

        return med;
    }
    public static void main(String[] args) {
        int[] v={56,67,30,79};
        Integer ans=calculation(v);
        System.out.println(ans);
    }
}
