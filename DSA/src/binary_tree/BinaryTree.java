package binary_tree;

public class BinaryTree {
    public static void main(String[] args) {
        // 4, 2, 8, 3, 1, 7, 9, 6, 5
        int[]   arr = { 4, 2, 8, 3, 1, 7, 9, 6, 5 };

        // tree insert
        BST tree = new BST(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            tree.insert(new BSTNode(arr[i]));
        }

        tree.inOrder();
        // Let's do some search
        tree.search(4);
        tree.search(3);
        tree.search(6);
        tree.search(10);
    }
}

class BSTNode {
    int data; // data can be anything as long as you can compare two data
    BSTNode left;
    BSTNode right;

    public BSTNode(int data) {
        this.data = data;
        left = right = null;
    }

    public void addChild(BSTNode newNode) {
        // add a new node as a new child of the current node
        // but if the current node has a child at the same location already
        // call this method recursively to the child
        if (newNode.data == data) {
            // duplicated data => do nothing
            return;
        }
        if (newNode.data < data) {
            if (left == null) {
                left = newNode;
            } else {
                left.addChild(newNode);
            }
        } else {
            if (right == null) {
                right = newNode;
            } else {
                right.addChild(newNode);
            }
        }
    }
}

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