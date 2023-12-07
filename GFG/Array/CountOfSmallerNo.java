package GFG.Array;

public class CountOfSmallerNo {
    public static void main(String[] args) {
        int[] a = {7, 4, 5, 3, 9, 8, 5};
        int target = 2;

        boolean tar=true;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<=target){
                tar=true;
                count++;
            }
            else {
                tar=false;
            }
        }
        if(tar){
            System.out.println(count);
        }
        else {
            System.out.println(-1);
        }

    }
}
