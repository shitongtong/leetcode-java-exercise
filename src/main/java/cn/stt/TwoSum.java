package cn.stt;

/**
 * 给定一个整数数组，返回这两个数字的索引，使它们合计成一个特定的目标。
 * 您可能会认为每个输入都只有一个解决方案，并且您可能不会使用相同的元素两次。
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/3/22.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int a = nums[i];
                int b = nums[j];
                if (a + b == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
