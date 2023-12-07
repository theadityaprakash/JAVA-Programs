package GFG.String;

public class countCamelCase {
    public static void main(String[] args) {
        String s="wAtcH";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if (Character.isUpperCase(ch)){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);
    }
}
