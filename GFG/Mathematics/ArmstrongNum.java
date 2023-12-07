package GFG.Mathematics;

public class ArmstrongNum {
    
    static int cal(int a){
        int n=a;
        int count=0;
        while(n>0){
            n=n/10;
           count=count+1;
        }
        n=a;
        int digit;
        int product=1;
        int sum=0;
        while (n>0){
            digit=n%10;
            for (int i = 1; i <= count; i++) {
                product=product*digit;
            }
            sum=sum+product;

            n=n/10;
        }

        return sum;
    }
    public static void main(String[] args) {
        int num=153;
        int result= cal(num);

        if(result==num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
