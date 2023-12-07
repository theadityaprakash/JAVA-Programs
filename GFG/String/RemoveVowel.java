package GFG.String;

public class RemoveVowel {

    public static void main(String[] args) {
        String s="programming";
        System.out.println(s.replaceAll("[[aeiouAEIOU]]",""));

    }
}
