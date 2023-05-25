package Binary_method;

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
