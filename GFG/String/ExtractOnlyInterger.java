package GFG.String;

import java.util.ArrayList;

public class ExtractOnlyInterger {

    static ArrayList<String> cal(String s){
        ArrayList<String> inta=new ArrayList<>();
        String a="";
        for (int i = 0; i < s.length(); i++) {
           if(Character.isDigit(s.charAt(i))) {
               a = a + s.charAt(i)+" ";
           }
        }
        inta.add(a);
        return inta;
    }
    public static void main(String[] args) {
       String s = "1: Prakhar Agrawal, 2: Aditya Prakash, 3: Rishabh Gupta56";

       ArrayList<String> result=cal(s);
        System.out.println(result.get(0));
    }
}
