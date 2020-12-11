package Strings;

import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        String string1 = "anagram";
        String string2 = "nagaram";
        System.out.println(isAnagram(string1, string2));
    }

    // 그냥 sort 하고 같으면 같은 조합으로 쓴거지뭐!
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
