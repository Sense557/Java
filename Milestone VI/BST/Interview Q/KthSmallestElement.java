class Solution {
    int ans = 0;
    int count = 0;
    public void inorderTraversal(TreeNode root, int k){ 
        if(root == null)
            return;
        
        inorderTraversal(root.left, k);
        count++;
        if(count == k){
            ans = root.val;
            return;
        }
        inorderTraversal(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k){
        inorderTraversal(root, k);
        return ans;
    }
}
