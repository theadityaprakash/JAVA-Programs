package practice;

public class CountEqualSubstrings {
    public static void main(String[] args) {
        String S = "gEEk";
        int result = countEqualSubstrings(S);
        System.out.println("Output: " + result);
    }

    public static int countEqualSubstrings(String S) {
        int count = 0;
        int[] freq = new int[26]; // To store frequency of characters

        int diffCount = 0; // Difference between uppercase and lowercase

        for (char c : S.toCharArray()) {
            if (Character.isLowerCase(c)) {
                diffCount++;
            } else {
                diffCount--;
            }

            // If the difference is 0, it means we've found a valid substring
            if (diffCount == 0) {
                count++;
            }

            // Adding frequency of character to the array
            freq[Character.toLowerCase(c) - 'a']++;
        }

        // Counting additional substrings which are already balanced
        for (int f : freq) {
            count += (f * (f - 1)) / 2;
        }

        return count;
    }
}
