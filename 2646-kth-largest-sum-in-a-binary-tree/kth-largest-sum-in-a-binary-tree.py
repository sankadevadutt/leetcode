# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
import heapq
from collections import defaultdict
class Solution:
    def kthLargestLevelSum(self, root: Optional[TreeNode], k: int) -> int:
        heap = []

        queue = deque([(root,0)])
        levelSum = defaultdict(int)
        while queue:
            node, level = queue.popleft()
            levelSum[level] += node.val

            if node.right != None:
                queue.append((node.right, level+1))
            
            if node.left != None:
                queue.append((node.left, level+1))

        for sum in levelSum.values():
            if len(heap) < k:
                heapq.heappush(heap, sum)
            else:
                if heap[0] < sum:
                    heapq.heappushpop(heap,sum)

        if len(heap) < k:
            return -1




        return heap[0]
