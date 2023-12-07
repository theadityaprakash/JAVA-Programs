package array02;

public class minNo {
    public static void main(String[] args) {
        int[] a={23,21,53,2,56,3,12};

        int min=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
