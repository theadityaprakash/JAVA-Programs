package GFG.Array;

import java.util.Arrays;

/*Given a array of length N, at each step it is reduced by 1 element.
// In the first step the maximum element would be removed, while in the second step minimum element of the remaining array would be removed, in the third step again the maximum and so on.
// Continue this till the array contains only 1 element. And find the final element remaining in the array.*/
public class leftElement {
    public static void main(String[] args) {
        int[] a={2,14,1,5,3,8,4};
        Arrays.sort(a);
        int n= a.length;

            if(n%2==0){
                System.out.println(a[(n/2)-1]);
            }
            else {
                System.out.println(a[(n/2)]);
            }
    }
}
