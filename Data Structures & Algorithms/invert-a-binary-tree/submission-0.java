/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        //swap left with right keep the root and children
        // TreeNode is like linkedlist with pointers in front and back
        // [l v r]-->[l v r]-->
        // store left in temp swap point left to the right and then right to temp
        // recursion with each lowest l,r swap

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        

         invertTree(root.left);
         invertTree(root.right);

         return root;
    }
}
