class Solution {
    public List<Integer> DisFunction(TreeNode root, List<Integer> list){
        if(root==null)
            return list;

        DisFunction(root.left,list);

        //add in inorder
        list.add(root.val);

        DisFunction(root.right,list);

        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        return DisFunction(root,list);
    }
}