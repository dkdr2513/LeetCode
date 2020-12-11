package Arrays;
import java.util.Arrays;
public class rotate {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5, 6, 7, 8};
        _rotate(prices, 3);
        System.out.println(Arrays.toString(prices));
    }

    public static void _rotate(int[] nums, int k) {
        k %= nums.length; // 짝수 홀수 k 값 범위 설정
        reverse(nums, 0 , nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }
    // 1 2 3 4 있으면  4 3 2 1 로 바꾸고 k = 2 이면  그걸 기준으로 또 바꾼다 3 4 1 2
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
