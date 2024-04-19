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
    private int minHeight = Integer.MAX_VALUE;
    public void helper(TreeNode root, int height){
        if(root == null) return;
        if(root.left == null && root.right == null){
            minHeight = Math.min(height, minHeight);
            return;
        }
        height++;
        helper(root.left, height);
        helper(root.right, height);
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        helper(root, 1);
        return minHeight;
    }
}