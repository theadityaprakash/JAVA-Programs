package GFG.Number;

import static java.lang.Math.pow;

//1st method [Time complexity O(n)]
/*public class EvenSquare {
    static int cal(int n){
        int sum=0;
        for (int i = 2; i <=n*2 ; i+=2) {
            if(i%2==0){
                sum+=pow(i,2);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=2;
        int result=cal(n);
        System.out.println(result);
    }
}*/



//2nd method using sum of the first n positive even integer formula [Time complexity O(1)]
public class EvenSquare {
    public static void main(String[] args) {
        int n=2;
        int sum=2*n*(n+1)*(2*n+1)/3;
        System.out.println(sum);
    }
}
