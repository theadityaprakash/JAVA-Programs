package array02;

public class max_minNo {
    public static void main(String[] args) {
        int[] a={23,21,53,2,56,3,12};

        int num=a[0];
        int num1=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>num){
                num=a[i];
            } else if (num1>a[i]) {
                num1 = a[i];

            }
        }
        System.out.println(num +"    "+num1);

    }
}
