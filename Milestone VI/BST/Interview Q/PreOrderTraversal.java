public class PreOrderTraversal {
    List<Integer> L = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return L;
        L.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return L;
    }
}
