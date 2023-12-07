package GFG.Number;

/*public class occurrencesOf_Num {
    static int Range(int l,int h,int n){
        int sum=0;
        for (int i = l+1; i < h; i++) {
            int temp=i;

            while (temp>0){
                int digit=temp%10;
                if(digit==n){
                    sum+=1;
                }
                temp/=10;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int LowerRange=18;
        int HigherRange=81;
        int Number=9;
        int result=Range(LowerRange,HigherRange,Number);
        System.out.println(result);
    }
}*/



//Only two testcase pass
public class occurrencesOf_Num {
    static int Range(int l,int h,int n){
        int count=0;
        for (int i = l; i <h ; i++) {
            if(i%n==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int LowerRange=18;
        int HigherRange=81;
        int Number=9;
        int result=Range(LowerRange,HigherRange,Number);
        System.out.println(result);
    }
}