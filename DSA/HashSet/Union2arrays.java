package DSA.HashSet;
//Find the count of union of two arrays

import java.util.HashSet;
public class Union2arrays {

    static int union(int[] arr1,int[]arr2){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int i=0;i< arr2.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }


    public static void main(String[] args) {
        int[] arr1={2,4,1};
        int[] arr2={3,4,5,3,4,2};
        int result=union(arr1,arr2);
        System.out.println(result);

    }
}
