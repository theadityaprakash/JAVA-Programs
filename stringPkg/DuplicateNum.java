package stringPkg;

public class DuplicateNum {
    public static void main(String[] args) {
        String s="Programming";

        //2nd method
        StringBuilder sb1=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c= sb1.charAt(i);
            int index= s.indexOf(c, i+1);
            if(index ==-1){
                sb1.append(c);
            }
        }
        System.out.println(sb1);


        //method 3
        StringBuilder sb=new StringBuilder();
        s.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);
    }
}
