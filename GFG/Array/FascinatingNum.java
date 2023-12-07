package GFG.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class FascinatingNum {

    static void fascinating(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=a.length;
        for (int i = 0; i < n; i++) {
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int mul2 = num * 2;
        int mul3 = num * 3;
        int[] a = {num, mul2, mul3};
        Arrays.sort(a);

        fascinating(a);


    }

}
