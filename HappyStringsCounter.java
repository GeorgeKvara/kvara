import java.util.*;

public class HappyStringsCounter {
    public static int numberOfHappyStrings(List<String> strings) {
        int count = 0;
        for (String str : strings) {
            if (isHappyString(str)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isHappyString(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> result = Arrays.asList(
                // Example string
                "abbcc", "abc", "abcabc", "cabcbb",
                // Happy strings
                "ab", "abc", "acb", "bac", "bca", "cab", "cba", "a", "b", "c", "ababab", "acbacb", "abcabcabc", "bcabca", "cabcbc", "cbacbacb",
                // Unhappy strings
                "aa", "bb", "cc", "aaa", "bbb", "ccc", "aab", "abb", "bcc", "bba", "cca", "cac", "baa", "bccbb", "aaabb", "bbbcc", "ccaabb", "bbccaa", "ccaaabb", "aaabbbcc", "aabbaabb"
        );
        int numberOfHappyStrings = numberOfHappyStrings(result);
        boolean exactly19HappyStrings = numberOfHappyStrings == 19;
        System.out.println("Are there exactly 19 Happy Strings? " + exactly19HappyStrings);
    }

}
