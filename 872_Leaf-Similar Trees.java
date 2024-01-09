class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();

        inOrder(root1,s1);
        inOrder(root2,s2);

        return s1.toString().equals(s2.toString());
    }

    private void inOrder(TreeNode root, StringBuilder s){
        if(root==null)
            return;

        if(root.left==null && root.right==null){
            s.append(root.val).append("_");
            return;
        }

        inOrder(root.left,s);
        inOrder(root.right,s);
    }
}