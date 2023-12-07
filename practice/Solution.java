package practice;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        if(a%2!=0){
            System.out.println("Wired");
        }
        else if (a%2==0 && a>=2 && a<5) {
            System.out.println("Not Weird");
        }
        else if(a%2==0 && a>=6 && a<=20){
            System.out.println("Wired");
        }
        else if(a%2==0 && a>20){
            System.out.println("Not Wired");
        }
    }
}