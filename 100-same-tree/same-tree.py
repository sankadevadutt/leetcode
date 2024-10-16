# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        dq1 = deque()
        dq2 = deque()

        if p and not q:
            return False
        
        if not p and q:
            return False
        
        if not p and not q:
            return True
        
        dq1.append(p)
        dq2.append(q)

        while dq1 and dq2:
            p1,q1 = dq1.popleft(), dq2.popleft()
            if p1.val != q1.val:
                return False
            if (p1.left and not q1.left) or (not p1.left and q1.left):
                return False
            if (p1.right and not q1.right) or (not p1.right and q1.right):
                return False
            if p1.left:
                dq1.append(p1.left)
                dq2.append(q1.left)

            if p1.right:
                dq1.append(p1.right)
                dq2.append(q1.right)
        
        return True