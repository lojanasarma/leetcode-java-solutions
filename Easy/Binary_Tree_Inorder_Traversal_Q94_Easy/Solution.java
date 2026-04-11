package Binary_Tree_Inorder_Traversal_Q94_Easy;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    // Inorder traversal method
    public List<Integer> inorderTraversal(TreeNode root) {

        // Create an empty list to store result
        List<Integer> result = new ArrayList<>();

        inorder(root, result); // call helper

        return result; // return result
    }

    // helper method for recursion
    public void inorder(TreeNode root, List<Integer> result) {

        // Base case
        if (root == null) {
            return;
        }

        inorder(root.left, result);   // go left
        result.add(root.val);         // visit root
        inorder(root.right, result);  // go right
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution sol = new Solution();
        List<Integer> result = sol.inorderTraversal(root);

        System.out.println(result); // Output: [1, 3, 2]
    }
}
