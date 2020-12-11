package Strings;

public class firstUniqueCharInString {
    public static void main(String[] args) {
        String input = "aadadaad";
        System.out.println(findUniqueChar(input));
    }


    // could be better solution
    public static int findUniqueChar(String input) {
        int index = -1;
        boolean has_dup;
        for (int i = 0; i < input.length(); i++) {
            has_dup = false;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j) && j != i) {
                    has_dup = true;
                    break;
                }
            }
            if (!has_dup) {
                return i;
            }
        }
        return index;
    }
}

