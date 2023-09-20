class Solution {

    public void inorderTraversal(TreeNode root, List<Integer> ans){
        if(root == null)
            return;

        inorderTraversal(root.left, ans);
        ans.add(root.val);
        inorderTraversal(root.right, ans);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ans = new ArrayList<>();
        
        inorderTraversal(root, ans);
        return ans.get(k-1);
        
    }
}
