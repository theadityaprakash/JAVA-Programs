package GFG.Array;

public class addAverage {
    public static void main(String[] args) {
        int []a={2,14,1,5,3,8,4};
        float temp=0;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            count++;
            temp=temp+a[i];
        }
        System.out.println((int)temp);
        float avg;
        avg=temp/count;
        System.out.println(avg);
    }
}
