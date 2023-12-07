package GFG.Mathematics;

import java.util.ArrayList;
import java.util.Collections;

public class swap2numUsingList {

    static ArrayList<Integer> calculation(int a,int b){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(b);
        list.add(a);

        return list;
    }

    public static void main(String[] args) {
        int a=8;
        int b=5;

        ArrayList<Integer> result=calculation(a,b);
        System.out.println(result);
    }
}
