package array02;

/*public class SelectionSort {
    public static void main(String[] args) {
        int[] a={20,40,10,5,60,2,30,59};

        int min; int temp=0;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}*/

import java.util.Scanner;
public class SelectionSort{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        int[] a=new int[n];

        for (int k = 0; k < a.length; k++) {
            a[k] = s.nextInt();

            int min;
            int temp = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
                min = i;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[min]) {
                        min = j;
                    }
                }

                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }

        for (int k = 0; k < a.length; k++) {
        System.out.print(a[k]+" ");

    }
    }
}