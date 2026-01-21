class BinarySearchTree {

    // Node class
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // Insert into BST
    Node insert(Node root, int value) {
        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

    //  Inorder Traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    //  Preorder Traversal
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    //  Search element
    boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    //  Delete node
    Node delete(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // Node with one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children
            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    // Find minimum value
    int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    //  Find maximum value
    int findMax(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    //  Count total nodes
    int countNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // Count leaf nodes
    int countLeafNodes(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    // Tree height
    int height(Node root) {
        if (root == null)
            return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }


    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values)
            bst.root = bst.insert(bst.root, v);

        System.out.print("Inorder: ");
        bst.inorder(bst.root);

        System.out.print("\nPreorder: ");
        bst.preorder(bst.root);

        System.out.print("\nPostorder: ");
        bst.postorder(bst.root);

        System.out.println("\n\nSearch 60: " + bst.search(bst.root, 60));

        bst.root = bst.delete(bst.root, 80);
        System.out.print("Inorder after deleting 80: ");
        bst.inorder(bst.root);

        System.out.println("\nMinimum value: " + bst.findMin(bst.root));
        System.out.println("Maximum value: " + bst.findMax(bst.root));

        System.out.println("Total nodes: " + bst.countNodes(bst.root));
        System.out.println("Leaf nodes: " + bst.countLeafNodes(bst.root));
        System.out.println("Tree height: " + bst.height(bst.root));
    }
}
