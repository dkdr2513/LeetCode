package Strings;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};
        _reverseString(chars);
        System.out.println(chars);
    }
    public static void _reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
