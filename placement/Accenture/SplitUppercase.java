package placement.Accenture;

public class SplitUppercase {
    public static void main(String[] args) {
        String s = "adityaPrakashDoingCoding";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                System.out.println();
            }
            System.out.print(ch);
        }
    }
}

