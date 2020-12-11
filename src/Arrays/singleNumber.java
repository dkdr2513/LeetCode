package Arrays;

public class singleNumber {
    // Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    //    Example 1:
    //
    //    Input: nums = [2,2,1]
    //    Output: 1
    //    Example 2:
    //
    //    Input: nums = [4,1,2,1,2]
    //    Output: 4
    //    Example 3:
    //
    //    Input: nums = [1]
    //    Output: 1

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        System.out.println(_singleNumber(array));
    }
    //ㅅㅂ 이거 ㄹㅇ 개천재 방법. XOR 쓰는건데 XOR 자기자신 하면 0 나오고 XOR 0 하면 자기자신이 나오는점을 이용한거임.
    // XOR 은 순서 상관 없기때문에 결국 같은 애들끼리 사라지고 혼자 남은애만 남게됨. (a ^ b ^ b ^ c ^ c )이면 (a ^ (b ^ b) ^ (c ^ c)) 이니까 (a ^ (0) ^ (0))
    public static int _singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
