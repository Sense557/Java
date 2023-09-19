public class PostOrderTraversal {

    List<Integer> L = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return L;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        L.add(root.val);
        return L;
    }
}
