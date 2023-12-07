package practice;

public class incrementUptoNum {
    public static void main(String[] args) {
        int a=6 ,b=5,n=10;

        //1st method
        /*int count=0;
        int count1=0;
        int min=0;
        while (a!=n || b!=n){
            if(a<b){
                a++;
                count++;
            }
            else{
                b++;
                count1++;
            }

            min=Math.max(count,count1);
        }
        System.out.println(min);*/

        //2nd method
        int ans=n-Math.max(a,b);
        System.out.println(ans);
    }
}
