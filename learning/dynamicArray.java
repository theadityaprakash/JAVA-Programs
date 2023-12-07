package learning;
import java.util.Scanner;
public class dynamicArray {



    /*public static void out(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] in() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = in();
        out(a);
    }*/

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

       /** dynamicArray obj=new dynamicArray();
        for(int i=1;i<n;i++){}
        obj.add(n+i);**/
    }
}