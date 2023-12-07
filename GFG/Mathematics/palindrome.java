package GFG.Mathematics;

public class palindrome {

    static int cal(int a){
        int digit;
        int sum=0;
        while(a>0){
            digit=a%10;
            sum=sum+digit;
            a=a/10;
        }
        int l=sum;
        int p;
        int temp=0;
        while(l>0){
            p=l%10;
            temp=temp*10+p;
            l=l/10;
        }
        int result;
        if(temp==sum){
            result=1;
        }
        else{
            result=0;
        }
        return result;

    }
    public static void main(String[] args) {
        int n=9976;
       int result= cal(n);
        System.out.println(result);
    }
}
