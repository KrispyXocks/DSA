package Binary_method;
public class BinaryTree {
    public TreeNode arrayToBinaryTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return constructTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = constructTree(nums, start, mid - 1);
        node.right = constructTree(nums, mid + 1, end);

        return node;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
