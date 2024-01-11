class Solution {
    public int findMaxDiff(TreeNode root, int minV, int maxV) {
        if (root == null) {
            return Math.abs(minV - maxV);
        }

        minV = Math.min(root.val, minV);
        maxV = Math.max(root.val, maxV);

        int l = findMaxDiff(root.left, minV, maxV);
        int r = findMaxDiff(root.right, minV, maxV);

        return Math.max(l, r);
    }

    public int maxAncestorDiff(TreeNode root) {
        int minV = root.val;
        int maxV = root.val;

        return findMaxDiff(root, minV, maxV);
    }
}