package Arrays;

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
        for (int j = 0; j < nums.length; j++) { // 정렬되어 같은건 모여있기 떄문에, 하나씩 처음부터 확인하면된다.
                                                // 그렇게 다른거 만나면 다음 새로운
                                                // 숫자니까 그 자리에 그 다음 처음보는 새로운 숫자를 넣기.
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
