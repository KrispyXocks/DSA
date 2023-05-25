package Binary_method;

class BST {
    BSTNode root;

    public BST(int data) {
        root = new BSTNode(data);
    }

    public void insert(BSTNode newNode) {
        root.addChild(newNode);
    }

    public void inOrder() {
        // start the inOrder traversal from root
        inOrderRecursive(root);
    }

    public void visit(BSTNode n) {
        System.out.print(n.data);
    }

    public void inOrderRecursive(BSTNode n) {
        if (n == null) {
            return;
        }
        // traverse left
        inOrderRecursive(n.left);
        // visit
        visit(n);
        // traverse right
        inOrderRecursive(n.right);
    }

    public BSTNode search(int x) {
        // search for the value x in this tree
        // return the node containing x
        BSTNode node = root;
        int comparison = 0;
        while (node != null) {
            comparison++;
            if (node.data == x) {
                System.out.println("\nNumber of comparisons to find " + x + " is: " + comparison);
                return node;
            }
            if (x < node.data) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        System.out.println("Cannot find " + x + " after " + comparison + " comparison(s)");
        return null;
    }
}
