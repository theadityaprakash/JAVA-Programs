package practice;

public class threeMachine {
    public static void main(String[] args) {
        int n=6;
        int m1=3*n,m2=4*n,m3=6*n;

        int ans=Math.min(m1,m2);
        int newans=Math.min(ans,m3);
        System.out.println(newans);
    }
}
