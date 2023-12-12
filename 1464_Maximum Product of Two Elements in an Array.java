public class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int maxNum = nums[0];
        int result = 0;

        for (int i = 1; i < n; i++) {
            result = Math.max(result, (maxNum - 1) * (nums[i] - 1));
            maxNum = Math.max(maxNum, nums[i]);
        }

        return result;
    }
}
