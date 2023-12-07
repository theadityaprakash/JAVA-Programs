package array02;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] a={23,21,53,2,56,3,12};

        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }

        }
        //int minsec=Integer.MAX_VALUE;
        int minsec=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=min && a[i]<minsec){
                minsec=a[i];
            }
        }
        System.out.println(minsec);
    }

}
