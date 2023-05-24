import QuickSort.quick_sort;
import Binary_method.BinaryTree;

import javax.swing.tree.TreeNode;

public class main {
    public static void main(String[] args) {
        // quick_sort
        int[] arr = { 1, 5, 2, 7, 3, 9, 4, 6, 8 };
        quick_sort.quicksort(arr);
        // low to high
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // high to low
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        int[] arr2 = { 1, 5, 2, 7, 3, 9, 4, 6, 8 };
        // setup the binary tree
        BinaryTree bt = new BinaryTree();
        TreeNode root = (TreeNode) bt.arrayToBinaryTree(arr2);
    // binary tree sort
        pu
    }
}
