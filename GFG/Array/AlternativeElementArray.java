package GFG.Array;

public class AlternativeElementArray {
    public static void main(String[] args) {
        int[] a={1,3,4,5,3};

        //1st method
        int count=0;
        for (int i = 0; i <= a.length; i++) {
            if(i%2==0){
                System.out.println(a[i]);
            }
            else{
                count++;
            }

        }

        //2nd method
        for(int i=0; i< a.length; i+=2){
            System.out.print(a[i]+" ");
        }
    }
}
