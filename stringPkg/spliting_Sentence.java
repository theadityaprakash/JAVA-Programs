package stringPkg;

public class spliting_Sentence {
    public static void main(String[] args) {
        String s="i m aditya";

        String[] sa=s.split(" ");

        for (int i = 0; i < sa.length; i++) {
            System.out.println(sa[i]);
        }


    }
}
