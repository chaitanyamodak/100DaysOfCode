public class Solution {
    private int result = Integer.MIN_VALUE;

    public int solve(TreeNode root, int start) {
        if (root == null) {
            return 0;
        }

        int LH = solve(root.left, start);
        int RH = solve(root.right, start);

        if (root.val == start) {
            result = Math.max(LH, RH);
            return -1;
        } else if (LH >= 0 && RH >= 0) {
            return Math.max(LH, RH) + 1;
        } else {
            int d = Math.abs(LH) + Math.abs(RH);
            result = Math.max(result, d);

            return Math.min(LH, RH) - 1;
        }
    }

    public int amountOfTime(TreeNode root, int start) {
        solve(root, start);
        return result;
    }
}