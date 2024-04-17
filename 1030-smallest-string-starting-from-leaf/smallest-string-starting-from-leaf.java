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
    public List<String> st = new ArrayList<>();
    public String smallestFromLeaf(TreeNode root) {
        helper(root, "");
        Collections.sort(st);
        return st.get(0);
    }

    public void helper(TreeNode root, String cur){
        if(root.left == null && root.right == null) {
            st.add((char)('a'+root.val)+cur);
            return;
        }
        if(root.left!=null) helper(root.left, (char)('a'+root.val)+cur);
        if(root.right!=null) helper(root.right, (char)('a'+root.val)+cur);
    }
}