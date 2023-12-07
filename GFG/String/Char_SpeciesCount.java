package GFG.String;

public class Char_SpeciesCount {
    public static void main(String[] args) {
        String s="#GeeKs01fOr@gEEks07";
        int[] count={0,0,0,0};
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                count[0]++;
            }
            if(Character.isLowerCase(ch)){
                count[1]++;
            }
            if(Character.isDigit(ch)){
                count[2]++;
            }
            if(!Character.isDigit(ch) && !Character.isAlphabetic(ch)){
                count[3]++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }

}
