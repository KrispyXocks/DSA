package Binary_method;
// time complexity: O(nlogn)
public class BinaryTree {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 3, 1, 7, 9, 6, 5};

        // tree insert
        BST tree = new BST(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            tree.insert(new BSTNode(arr[i]));
        }
        System.out.println("the sorted array is: ");
        tree.inOrder();
        // Let's do some search
        tree.search(4);
        tree.search(3);
        tree.search(6);
        tree.search(10);
    }
}
