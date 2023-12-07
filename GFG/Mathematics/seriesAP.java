package GFG.Mathematics;

public class seriesAP {
    static int cal(int a,int b,int N){
        int d=b-a;
        int an=a+(N-1)*d;
        return an;
    }
    public static void main(String[] args) {
        int firstNum=2;
        int secondNum=4;
        int term=6;
        int result=cal(firstNum,secondNum,term);
        System.out.println(result);
    }
}
