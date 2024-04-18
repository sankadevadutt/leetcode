/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    Map<Integer, List<Integer>> mp = new HashMap<>();

    public void helper(Node root, int level){
        if(root == null){
            return;
        }
        if(!mp.containsKey(level)){
            List<Integer> lt2 = new ArrayList<>();
            mp.put(level, lt2);
        }
        mp.get(level).add(root.val);
        level++;
        for(Node node : root.children){
            helper(node, level);
        }
        return;
    }


    public List<List<Integer>> levelOrder(Node root) {
        helper(root, 0);
        List<List<Integer>> lt = new ArrayList<>();
        for(int i : mp.keySet()){
            lt.add(mp.get(i));
        }
        return lt;
    }
}