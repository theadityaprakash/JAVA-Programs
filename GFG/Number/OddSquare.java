package GFG.Number;

import static java.lang.Math.pow;

//1st method [Time complexity O(n)]
/*public class OddSquare {
    static  int cal(int n){
        int sum=0;
        for (int i = 1; i <2*n; i++) {
            if(i%2!=0){
                sum+=pow(i,2);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=3;
        int result=cal(n);
        System.out.println(result);
    }
}*/


//2nd method using sum of the first n positive odd integer formula [Time complexity O(1)]
public class OddSquare {
    public static void main(String[] args) {
        int n=3;
        int sum=n*(2*n+1)*(2*n-1)/3;
        System.out.println(sum);
    }
}