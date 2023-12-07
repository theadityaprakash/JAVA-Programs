package GFG.String;

public class ReverseVowel {

    static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;

        return false;
    }

    static String revString(String s){
        int start=0;
        int end=s.length()-1;

        char[] charArr= s.toCharArray();

        while(start<end){
            if(!isVowel(charArr[start])){
                start++;
                continue;
            }

            if(!isVowel(charArr[end])){
                end--;
                continue;
            }

            char c=charArr[start];
            charArr[start]=charArr[end];
            charArr[end]=c;

            start++;
            end--;
        }
        return String.copyValueOf(charArr);
    }
    public static void main(String[] args) {
     String s="practice";
     revString(s);

        System.out.println(ReverseVowel.revString(s));
    }
}
