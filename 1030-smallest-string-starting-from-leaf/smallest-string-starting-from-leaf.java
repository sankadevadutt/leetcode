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
    public HashMap<Integer,Character> mp = new HashMap<>();
    public String smallestFromLeaf(TreeNode root) {
        for(int i = 0;i<26;i++){
            mp.put(i,(char)('a'+i));
        }
        System.out.println(mp);
        helper(root, "");
        Collections.sort(st);
        return st.get(0);
    }

    public void helper(TreeNode root, String cur){
        if(root.left == null && root.right == null) {
            st.add(mp.get(root.val)+cur);
            return;
        }
        if(root.left!=null) helper(root.left, mp.get(root.val)+cur);
        if(root.right!=null) helper(root.right, mp.get(root.val)+cur);
    }
}