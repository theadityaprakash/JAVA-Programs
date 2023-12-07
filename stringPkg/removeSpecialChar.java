package stringPkg;

public class removeSpecialChar {
    public static void main(String[] args) {
        String s="A^%d!@#i@!ty%$a*#@12*&%";

      String str=  s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
