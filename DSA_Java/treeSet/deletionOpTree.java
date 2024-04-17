class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class deletionOpTree {
    TreeNode root;

    deletionOpTree() {
        root = null;
    }

    TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    TreeNode minValueNode(TreeNode node) {
        TreeNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValueNode(root.right).key;
            root.right = deleteNode(root.right, root.key);
        }

        return root;
    }

    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        deletionOpTree tree = new deletionOpTree();
        TreeNode root = null;
        int[] keys = {50, 30, 20, 40, 70, 60, 80};

        for (int key : keys)
            root = tree.insert(root, key);

        System.out.print("Inorder traversal before deletion: ");
        tree.inorder(root);

        int keyToDelete = 40;
        root = tree.deleteNode(root, keyToDelete);

        System.out.print("\nInorder traversal after deletion of " + keyToDelete + ": ");
        tree.inorder(root);

    }
}