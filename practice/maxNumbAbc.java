package practice;

import java.util.HashMap;

public class maxNumbAbc {
    static void maxnum(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=a.length;

        for (int i = 0; i < n; i++) {
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i]+1));
            }
            else {
                map.put(a[i],1);
            }
        }

        for(int key1 : map.keySet()){
            if(map.get(key1)>n/3){
                System.out.println(key1);
            }
        }
    }
    public static void main(String[] args) {
        int[] a={2,4,3,2,7,4,2,3};
        maxnum(a);
        
    }
}
