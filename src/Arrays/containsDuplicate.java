package Arrays;

import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 3, 5, 7, 7, 8};
        _containsDuplicate(array);
        System.out.println(_containsDuplicate(array));
    }

    // Time complexity : O (n log n)
    // Space complexity : O (1)
    // sorting 을 하고나서
    // 한칸씩 한칸씩 보면서 같은게 있으면 return true;
    public static boolean _containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}
