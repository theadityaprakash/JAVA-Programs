package GFG.String;
import java.lang.*;

public class RemoveChar {
    public static void main(String[] args) {
        String s="sdf2d4,fAYf2m";
       String str= s.replaceAll("[^0-9]","");
        System.out.println(str);
    }
}
