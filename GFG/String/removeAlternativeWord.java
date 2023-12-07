package GFG.String;

public class removeAlternativeWord {

    //1st method
    public static void main(String[] args) {
        String s="Aditya";
        String str="";
        char[] s1=s.toCharArray();
        for (int i = 0; i < s1.length; i+=2) {
            str=str +s1[i];
        }
        System.out.println(str);
    }


    //2nd method
    /*public static void main(String[] args) {
        String s="Aditya";
        char[] s1=s.toCharArray();
        for (int i = 1; i < s1.length; i+=2) {
            s1[i]=' ';
        }
        System.out.println(new String(s1).replace(" ",""));
    }*/
}
