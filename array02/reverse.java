package array02;

public class reverse {
    public static void main(String[] args) {
        int[] a={20,30,1,23,43,2};

        //1st method
        for (int i = a.length-1; i >=0; i--) {
            System.out.print(a[i] +" ");
        }


        System.out.println("\n");
        //2nd method
        int n=a.length;
        int temp, start=0,end=n-1;
        while(start<end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+"->");
            }
    }
}
