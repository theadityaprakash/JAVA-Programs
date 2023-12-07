package GFG.Array;

public class SwapNum {
    public static void main(String[] args) {
        int[] a={2,4,3,2,5,2,8};
        int tar=4;
        int temp;

        for (int i=0;i<a.length;i++) {
            /*for (int j = a.length-1; j > 0; j--) {

                if (a[i] == tar && a[j] != tar) {
                    a[tar] = a[i];
                    a[i] = a[j];
                    a[j] = a[tar];
                    break;
                }
            }
            System.out.print(a[i] + " ");*/

            if(i+1==tar){
                temp=a[i];
                a[i]=a[a.length-tar];
                a[a.length-tar]=temp;
            }
            System.out.print(a[i]+" ");

        }
    }
}
