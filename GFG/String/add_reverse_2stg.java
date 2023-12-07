package GFG.String;

public class add_reverse_2stg {
    /*public static void main(String[] args) {
        String s1="big";
        String s2="Boy";
        String add=s1+s2;

        String revstr="";
        for (int i = add.length()-1; i >=0 ; i--) {
            revstr=revstr+add.charAt(i);
        }
        System.out.println(revstr);
    }*/

    public static void main(String[] args) {
        String s1="big";
        String s2="Boy";
        String add=s1+s2;

        StringBuilder sb=new StringBuilder(add);
        System.out.println(sb.reverse().toString());
        //System.out.println(sb.reverse());    //This is wrong
    }

}
