class Solution {
    public TreeNode getMin(TreeNode curr){
        while(curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        // Search the node to be deleted
        TreeNode parent = null;
        TreeNode curr = root;

        while(curr != null && curr.val != key){ //doesnot exist or found
            parent = curr;
            if(key < curr.val)
                curr = curr.left;
            else
                curr = curr.right;
        }
        
        if(curr == null)  // stop
            return root;
            //case1 : node has 0 children -> leaf node
            if(curr.left == null && curr.right == null){
                if(curr == root){
                    root = null;
                }else{
                    if(parent.left == curr)
                        parent.left = null;
                    else
                        parent.right= null;
                }
            }

            //case2: node has 1  child
            else if(curr.left == null || curr.right == null){
                TreeNode child;
                
                if(curr.left == null)
                    child = curr.right;
                else
                    child = curr.left;

                if(curr == root){
                    root = child;
                }
                else{
                    if(curr == parent.left)
                        parent.left = child;
                    else
                        parent.right = child;
                }
            }

            //case3: node has 2 children
            else{
                TreeNode min = getMin(curr.right);
                int minval = min.val;
                deleteNode(root, minval);
                curr.val = minval;
            }
            return root;
    }
}
