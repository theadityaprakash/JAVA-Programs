package DSA.ArrayList;

import java.util.ArrayList;

public class addElementToListUsingFunction {

    static ArrayList<Integer> calculation(int a,int b,int c){
        int length=3;
        ArrayList<Integer> addEle=new ArrayList<>();
        for (int i = 0; i < length; i++) {
            addEle.add(a);
            addEle.add(b);
            addEle.add(c);
        }
        return addEle;
    }
    public static void main(String[] args) {
        int a=1;
        int b=3;
        int c=8;

        ArrayList<Integer> result=calculation(a,b,c);
        System.out.println(result.get(0));
        System.out.println(result.get(1));
        System.out.println(result.get(2));
    }
}
