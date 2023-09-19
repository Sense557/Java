class Node {
    int val;
    Node left = null;
    Node right = null;

    Node(int val) {
        this.val = val;
    }
}

public class TreePractice2 {
    public static void levelOrderTraversal(Node root) {
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            printLevel(root, i);
        }
    }

    private static void printLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.val + " ");
        } else if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

    private static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        levelOrderTraversal(root);
    }
}
