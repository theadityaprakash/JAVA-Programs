package GFG.Number;
import java.util.Arrays;

//1st method
public class MiddleOf_3 {
    static void compare(int a,int b,int c){
        if(a>b && b>c ||b>a && b<c) {
            System.out.println(b);
        } else if (b>a && a>c || a>b && a<c) {
            System.out.println(a);
        }
        else {
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        int a=523;
        int b=720;
        int c=434;
        compare(a,b,c);
    }
}



//2nd method
/*public class MiddleOf_3 {
    static int cal(int a,int b,int c){
        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        Arrays.sort(arr);
        return arr[1];
    }
    public static void main(String[] args) {
        int a=123;
        int b=289;
        int c=242;
        int result=cal(a,b,c);
        System.out.println(result);
    }
}*/
