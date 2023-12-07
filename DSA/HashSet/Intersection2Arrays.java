package DSA.HashSet;
import java.util.HashSet;
public class Intersection2Arrays {

    static int intersect(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();

            for (int i = 0; i < arr1.length; i++) {
                set.add(arr1[i]);
            }
            int count=0;
            for (int j = 0; j < arr2.length; j++) {
                if(set.contains(arr2[j])){
                    count++;
                    set.remove(arr2[j]);
                }
            }
        return count;
    }


    public static void main(String[] args) {
        int[] arr1={2,4,5,3,7};
        int[] arr2={3,4,2,7,4,9};
        int result =intersect(arr1,arr2);
        System.out.println(result);
    }
}
