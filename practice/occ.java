package practice;

public class occ {
    public static void main(String[] args) {
        int l=8;
        int h=64;
        int n=5;

        int sum=0;
        for (int i = l+1; i < h; i++) {
            int temp=i;

            while (temp>0){
                int digit=temp%10;
                if(temp==n){
                   sum+=1;
                }
                temp/=10;
            }
        }
        System.out.println(sum);
    }
}
