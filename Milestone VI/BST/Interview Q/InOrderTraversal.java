public class InOrderTraversal {

    List<Integer> L = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return L;

        inorderTraversal(root.left);
        L.add(root.val);
        inorderTraversal(root.right);
        return L;
    }

}
