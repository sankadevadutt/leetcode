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
    Map<Integer, List<Integer>> mp = new HashMap<>();

    public void helper(TreeNode root, int level){
        if(root == null) return;
        if(!mp.containsKey(level)){
            mp.put(level, new ArrayList<>());
        }
        mp.get(level).add(root.val);
        level++;
        helper(root.left, level);
        helper(root.right, level);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root,0);
        List<List<Integer>> ans = new ArrayList<>();
        for(int val : mp.keySet()){
            ans.add(mp.get(val));
        }
        return ans;    
    }
}