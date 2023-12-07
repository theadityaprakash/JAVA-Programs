package OnlineClass;

import java.util.Scanner;

 class Assignment1 {


        private int  n,r;
    Assignment1(int n, int r){
        this.n=n;
        this.r=r;
    }
    public static double permutation(int n, int r) {
        double result = 1;

        for (int i = n; i > n - r; i--) {
            result *= i;
        }

        return result;
    }

    public static double combination(int n, int r) {
        double numerator = permutation(n, r);
        double denominator = factorial(r);

        return numerator / denominator;
    }

    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
      void display(){
        System.out.println("The permutation is "+permutation(n,r) );
          System.out.println("The combination is "+combination(n,r) );


      }

}
public class CombinationPermutation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();
        Assignment1 obj=new Assignment1(n,r);
        obj.permutation(n,r);
        obj.combination(n,r);
        obj.display();

    }
}