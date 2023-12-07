package array02;

import java.util.*;

public class sort_asce_des {

    //1st method

    /*public static void sol(int[] a,int n){
        Arrays.sort(a);
        for (int i = 0; i < n/2; i++) {
            System.out.print(a[i]+" ");
        }

        for (int j = n-1; j >=n/2 ; j--) {
            System.out.print(a[j]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {20, 30, 1, 23, 43,21,4};
        int n=a.length;
        sol(a, n);*/

    //2nd method
    public static void main(String[] args) {
        int[] a = {20, 30, 1, 23, 43,21,4};

        int n=a.length;
        int temp;
        for(int i=0;i<n;i++){
            for (int j = 0; j < n/2; j++) {
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            for (int j = n/2; j < n-1; j++) {
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
