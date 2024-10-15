# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        
        dq = deque()
        dq.append((root, 1))
        depth = 1
        while dq:
            node, level = dq.popleft()
            depth = max(depth, level)

            if node.left:
                dq.append((node.left, level+1))

            
            if node.right:
                dq.append((node.right, level+1))

        return depth
        