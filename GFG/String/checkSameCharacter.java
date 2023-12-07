package GFG.String;

public class checkSameCharacter {
    public static void main(String[] args) {

        String s="aaaaaa";
        boolean a=true;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(0)==s.charAt(i)){
               a=true;
           }
           else{
               a=false;
           }
        }
        System.out.println(a);
    }
}
