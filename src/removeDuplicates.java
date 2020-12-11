import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5};
        int size = new removeDuplicates()._removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, size)));
    }

    public int _removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
