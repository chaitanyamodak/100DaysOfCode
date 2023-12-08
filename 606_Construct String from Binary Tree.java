public class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        String result = Integer.toString(root.val);
        String l = tree2str(root.left);
        String r = tree2str(root.right);

        if (root.left == null && root.right == null) {
            return result;
        }

        if (root.right == null) {
            return result + "(" + l + ")";
        }

        if (root.left == null) {
            return result + "()" + "(" + r + ")";
        }

        return result + "(" + l + ")" + "(" + r + ")";
    }
}