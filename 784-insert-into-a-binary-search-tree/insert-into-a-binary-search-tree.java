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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode store = root;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return new TreeNode(val);
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.val < val){
                if(temp.right == null){
                    temp.right = new TreeNode(val);
                    return store;
                }
                queue.offer(temp.right);
            }else{
                if(temp.left == null){
                    temp.left = new TreeNode(val);
                    return store;
                }
                queue.offer(temp.left);
            }
        }
        return store;
    }
}