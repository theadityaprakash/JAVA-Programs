package GFG.String;

import java.util.ArrayList;

public class SeperateLine {
//print capital,small,number and Special Char in different line

    //1st method
    /*public static void main(String[] args) {
        String s="adi12AD21ItyTaYA1";
        char[] a=s.toCharArray();

        String small="";
        String capital="";
        String num="";
        for (int i = 0; i < a.length; i++) {
            if(a[i]>='a' && a[i]<='z'){
                small=small+a[i];
            } else if (a[i]>='A' && a[i]<='Z') {
                capital=capital+a[i];
            }else {
                num=num+a[i];
            }

        }
        System.out.println(small);
        System.out.println(capital);
        System.out.println(num);

    }*/

    //2nd Method Using ArrayLIst
    static ArrayList<String> display(String s){
        ArrayList<String> cal=new ArrayList<>();
        String alpha="";
        String digit="";
        String Symbol="";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))){
                alpha=alpha+s.charAt(i);
            } else if (Character.isDigit(s.charAt(i))) {
                digit=digit+s.charAt(i);
            }
            else {
                Symbol=Symbol+s.charAt(i);
            }
        }
        cal.add(alpha);
        cal.add(digit);
        cal.add(Symbol);
        return cal;
    }

    public static void main(String[] args) {
        String s="adi12AD21ItyTaYA1@#";
       ArrayList<String> result= display(s);
        System.out.println(result.get(0));
        System.out.println(result.get(1));
        System.out.println(result.get(2));
    }
}
