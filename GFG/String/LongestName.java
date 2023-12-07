package GFG.String;
import java.util.*;
public class LongestName {

    public static void main(String[] args) {
        String[] name={"adi","adit","adity","aditya"};


        String str=name[0];
        for (int i = 0; i < name.length; i++) {
            if (str.length() < name[i].length()){
                str=name[i];
            }
        }
        System.out.println(str);
    }


    //Using Function
    /* public static String cal(String name[]){
        String str=name[0];
        for (int i = 0; i < name.length; i++) {
            if(str.length()<name[i].length()){
                str=name[i];
            }

        }
        return str;
    }
    public static void main(String[] args) {
        String[] name={"adi","adit","adity","aditya"};
        String str1=cal(name);
        System.out.println(str1);
    }*/
}
