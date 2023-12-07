package array02;

public class maxNo {
    public static void main(String[] args) {
        int [] a={3,23,4,40,20};

        //1st method
            /*int max = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if(a[i]>max){
                    max=a[i];
                }
            }
            System.out.println(max);*/

        //2nd method
        int temp=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>temp){
                temp=a[i];
            }
        }
        System.out.println(temp);
    }

}