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
    private int maxDepth = 0;
    public void helper(TreeNode root, int level){
        if(root == null) return;
        if(root.left == null && root.right == null){
            maxDepth = Math.max(level, maxDepth);
        }
        level++;
        helper(root.left,level);
        helper(root.right,level);
    }
    public int maxDepth(TreeNode root) {
        helper(root, 1);
        return maxDepth;
    }
}