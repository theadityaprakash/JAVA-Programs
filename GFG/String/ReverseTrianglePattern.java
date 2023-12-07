package GFG.String;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseTrianglePattern {
    /*public static void main(String[] args) {
        String s = "aditya";

        String str="";
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            str=str+s.charAt(i);
            list.add(str);
        }
        Collections.reverse(list);
        for(String res:list) {
            System.out.println(res);
        }
    }*/


    //Using Function
    static ArrayList<String> reversetri(String st){
        String str="";
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < st.length(); i++) {
            str=str+st.charAt(i);
            list.add(str);
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        String st="Aditya";
        ArrayList<String> resultList = reversetri(st);
        for (String result : resultList) {
            System.out.println(result);
        }
    }
}
