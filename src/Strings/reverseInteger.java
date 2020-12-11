package Strings;

public class reverseInteger {
    // Given a 32-bit signed integer, reverse digits of an integer.
    //
    //Note:
    //Assume we are dealing with an environment that could only
    // store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem,
    // assume that your function returns 0 when the reversed integer overflows.

    // Example 1:
    //
    //Input: x = 123
    //Output: 321
    //Example 2:
    //
    //Input: x = -123
    //Output: -321
    //Example 3:
    //
    //Input: x = 120
    //Output: 21
    //Example 4:
    //
    //Input: x = 0
    //Output: 0
    public static void main(String[] args) {
        int a = 12345;

        System.out.println(reverse(a));
    }
    // i 는 x 의 낮은 숫자부터해서 결과 계속 더해가고
    // x 는 위에서 x 때갔으니까 한단계씩 낮춘다.
    public static int reverse(int x) {
        long i = 0;
        while (x != 0) {
            i = i * 10+ x % 10;
            x = x / 10;
        }
        if (i < Integer.MIN_VALUE || i > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)i;
        }
    }

}
