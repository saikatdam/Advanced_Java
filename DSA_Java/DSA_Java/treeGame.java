
class Node {
    int val;
    Node left;
    Node right;

    Node(int key) {
      this.val = key;
        this.left = null;
        this.right = null;
    }
}

class intialize {
    Node root;

   public intialize() {
        root = null;
    }

    public void insert(int data) {
        root = recurciveInsert(root, data);
    }

    public Node recurciveInsert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.val) {
            root.left= recurciveInsert(root.left, data);

        } else if(data > root.val) {
           root.right=  recurciveInsert(root.right, data);
        }
        return root;
    }

    public void inOrderTraversalRecursive() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node root) {
        if (root != null) {
            inOrderTraversalRecursive(root.left);
            System.out.print(root.val + " -> ");
            inOrderTraversalRecursive(root.right);
        }
        
    }
}

public class treeGame {
    public static void main(String args[]) {
        intialize init = new intialize();
        init.insert(11);
        init.insert(12);
        init.insert(13);
        init.insert(14);
        init.insert(15);
        init.inOrderTraversalRecursive();
        System.out.print("NULL");
    }
}
