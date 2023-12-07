package stringPkg;

import java.util.Scanner;

public class palindromeStr {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s= scan.next();

        String revrs="";
        for(int i=s.length()-1;i>=0;i--) {

            revrs = revrs + s.charAt(i);
        }
            if(s.equals(revrs)){
                System.out.println("its a palindrome");
            }
            else{
                System.out.println("its not a palindrome");
            }

    }
}
