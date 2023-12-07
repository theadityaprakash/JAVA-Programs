package GFG.Number;

public class SumDifferenceOf5 {
    static void examine(int n){
        if(n%5==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int n=29;
        examine(n);
    }
}
