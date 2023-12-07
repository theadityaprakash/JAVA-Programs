package stringPkg;

import java.util.Scanner;

public class reverseStrg {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.print("Enter your String : ");
        String s= scan.next();

        String str="";
        for(int i=s.length()-1;i>=0; i--){

            str=str+s.charAt(i);
        }
        System.out.pr  intln(str);*/


        String s="Aditya";

        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        System.out.println(str);

        //2nd method
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }

        System.out.println();

        //3rd method
        char[] ca=s.toCharArray();
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(ca[i]);
        }


        System.out.println();
        //4th method
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());

        //5th method
        StringBuilder sbu= new StringBuilder(s);
        System.out.println(sbu.reverse());
    }
}
