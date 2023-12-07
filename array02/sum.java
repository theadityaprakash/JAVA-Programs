package array02;

public class sum {
    public static void main(String[] args) {
        int[] a={20,30,1,23,43,2};

        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
