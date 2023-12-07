package GFG.Number;

import java.util.Scanner;

public class removeLastDigit {

    static void number(int n){

        int a=n/10;

        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        number(n);

    }
}
