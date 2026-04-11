package Binary_Tree_Inorder_Traversal_Q94_Easy;

/*
Thought Process:

When I read the question, I identified that it is related to the Tree topic
which I studied in the DSA Java module (Year 1 Semester 2).

I remembered that inorder traversal follows the order:
Left → Root → Right

So my approach was:
1. First visit the left subtree
2. Then process the root node
3. Finally visit the right subtree

This traversal logic was already clear to me.

However, I got confused when it came to storing the output.
The line "List<Integer> result = new ArrayList<>();" was new to me.

I did not understand:
- Why we need a List
- How values are stored during recursion

Because of this, I was unable to complete the solution on my own.

So I used AI to understand:
- How to create and use a List in Java
- How recursion adds values step by step into the list

With that help, I was able to complete the problem successfully.

What I learned:
- Inorder traversal logic
- How to use List and ArrayList
- How recursion works with data structures
*/

import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
